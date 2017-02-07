package name.gudong.bootstrap.model;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by GuDong on 2017/2/6 15:14.
 * Contact with gudong.name@gmail.com.
 */

@Singleton
@Component(modules = {
            ProviderModule.class,
            AppModule.class
        })
public interface AppComponent {

}
