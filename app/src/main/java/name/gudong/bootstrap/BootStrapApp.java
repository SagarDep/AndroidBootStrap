package name.gudong.bootstrap;

import android.app.Application;

import com.facebook.stetho.Stetho;

import name.gudong.bootstrap.component.AppComponent;
import name.gudong.bootstrap.component.DaggerAppComponent;
import name.gudong.bootstrap.module.AppModule;
import name.gudong.base.injection.NetModule;

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
        mAppComponent = createAppComponent();
        Stetho.initializeWithDefaults(this);
    }

    private AppComponent createAppComponent() {
        return DaggerAppComponent.builder().netModule(new NetModule()).appModule(new AppModule(this)).build();
    }

    public static BootStrapApp get() {
        return sInstance;
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
