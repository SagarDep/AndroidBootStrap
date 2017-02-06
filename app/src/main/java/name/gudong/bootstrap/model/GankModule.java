package name.gudong.bootstrap.model;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by GuDong on 2017/2/6 14:52.
 * Contact with gudong.name@gmail.com.
 */

@Module
public class GankModule {
    @Provides
    GankApi provideGankApi(final Retrofit retrofit) {
        return retrofit.create(GankApi.class);
    }
}
