package name.gudong.bootstrap;

import android.app.Application;

import com.facebook.stetho.Stetho;

import name.gudong.bootstrap.model.AppModule;
import name.gudong.bootstrap.model.DaggerAppComponent;

/**
 * Created by GuDong on 2017/2/6 17:25.
 * Contact with gudong.name@gmail.com.
 */

public class BootStrapApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }
}
