package name.gudong.bootstrap.component;

import dagger.Component;
import name.gudong.bootstrap.fragment.SearchFragment;
import name.gudong.bootstrap.injection.PerActivity;
import name.gudong.bootstrap.model.AppComponent;
import name.gudong.bootstrap.model.SearchModule;

@PerActivity
@Component(dependencies = {
            AppComponent.class
        }, modules = {
            SearchModule.class
        })
public interface SearchComponent {
    void inject(SearchFragment fragment);
}