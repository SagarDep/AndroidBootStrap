package name.gudong.bootstrap.component;

import dagger.Component;
import name.gudong.bootstrap.ui.MainActivity;

/**
 * Created by GuDong on 2017/2/6 15:56.
 * Contact with gudong.name@gmail.com.
 */

@Component
public interface MainComponent {
    void inject(MainActivity activity);
}
