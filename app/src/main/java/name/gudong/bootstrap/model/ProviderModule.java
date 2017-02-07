package name.gudong.bootstrap.model;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.Date;


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

//    @Singleton
    @Provides
    GankApi provideGankApi(final Retrofit retrofit) {
        return retrofit.create(GankApi.class);
    }

//    @Singleton
    @Provides
    Retrofit provideRetrofit(final OkHttpClient okHttpClient,
                             final Gson gson) {

        return new Retrofit.Builder().baseUrl("http://gank.io/api/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

//    @Singleton
    @Provides
    Gson provideGson() {
        final GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new DateDeserializer());
        return builder.create();
    }

//    @Singleton
    @Provides
    OkHttpClient provideHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        final OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(logging);
        builder.addNetworkInterceptor(new StethoInterceptor());
        return builder.build();
    }

}
