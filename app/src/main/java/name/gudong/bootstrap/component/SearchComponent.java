package name.gudong.bootstrap.component;

import dagger.Component;
import name.gudong.bootstrap.fragment.SearchFragment;
import name.gudong.bootstrap.injection.PerActivity;
import name.gudong.bootstrap.model.GankModule;
import name.gudong.bootstrap.model.ProviderModule;

@PerActivity
@Component(modules = {
        GankModule.class,
        ProviderModule.class
})
public interface SearchComponent {
    void inject(SearchFragment fragment);
}