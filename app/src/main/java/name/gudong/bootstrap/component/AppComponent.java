package name.gudong.bootstrap.component;

import javax.inject.Singleton;

import dagger.Component;
import name.gudong.bootstrap.module.AppModule;
import name.gudong.model.GankRepo;
import name.gudong.base.injection.NetModule;

/**
 * Created by GuDong on 2017/2/6 15:14.
 * Contact with gudong.name@gmail.com.
 */

@Singleton
@Component(
        modules = {
                NetModule.class,
                AppModule.class
        })
public interface AppComponent {
    GankRepo provideGankRepo();
}
