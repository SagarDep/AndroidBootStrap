package name.gudong.bootstrap;

import android.app.Application;

import com.facebook.stetho.Stetho;

import name.gudong.bootstrap.model.AppComponent;
import name.gudong.bootstrap.model.AppModule;
import name.gudong.bootstrap.model.DaggerAppComponent;

/**
 * Created by GuDong on 2017/2/6 17:25.
 * Contact with gudong.name@gmail.com.
 */

public class BootStrapApp extends Application {
    private AppComponent mAppComponent;
    private static BootStrapApp sInstance;

    private static void setInstance(final BootStrapApp instance) {
        sInstance = instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);
        Stetho.initializeWithDefaults(this);
        mAppComponent = createAppComponent();
    }

    private AppComponent createAppComponent() {
        return DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static BootStrapApp get() {
        return sInstance;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
