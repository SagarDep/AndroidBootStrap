package name.gudong.bootstrap.module;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by GuDong on 2017/2/6 15:6.
 * Contact with gudong.name@gmail.com.
 */

@Singleton
@Module
public class AppModule {
    private final Application mApplication;

    public AppModule(final Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    Resources provideResources() {
        return mApplication.getResources();
    }

    @Singleton
    @Provides
    Context provideContext() {
        return mApplication;
    }
}
