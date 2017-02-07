package name.gudong.bootstrap.component;

import dagger.Component;
import name.gudong.bootstrap.ui.SearchFragment;
import name.gudong.bootstrap.injection.PerActivity;
import name.gudong.bootstrap.module.SearchModule;

@PerActivity
@Component(dependencies = {
            AppComponent.class
        }, modules = {
            SearchModule.class
        })
public interface SearchComponent {
    void inject(SearchFragment fragment);
}