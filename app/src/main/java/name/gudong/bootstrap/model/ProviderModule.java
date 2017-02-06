package name.gudong.bootstrap.model;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by GuDong on 2017/2/6 15:08.
 * Contact with gudong.name@gmail.com.
 */
@Module
public class ProviderModule {
    @Provides
    Retrofit provideRetrofit(final OkHttpClient okHttpClient,
                             final Gson gson) {

        return new Retrofit.Builder().baseUrl("http://gank.io/api/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Provides
    Gson provideGson() {
        final GsonBuilder builder = new GsonBuilder();
        return builder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
    }

    @Provides
    OkHttpClient provideHttpClient() {
        final OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new HttpLoggingInterceptor());
        builder.addNetworkInterceptor(new StethoInterceptor());
        return builder.build();
    }

}
