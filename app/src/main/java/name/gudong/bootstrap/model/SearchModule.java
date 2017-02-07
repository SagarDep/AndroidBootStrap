package name.gudong.bootstrap.model;

import dagger.Module;
import dagger.Provides;
import name.gudong.bootstrap.model.repository.GankRepo;

/**
 * Created by GuDong on 2017/2/7 11:53.
 * Contact with ruibin.mao@moji.com.
 */

@Module(includes = {ProviderModule.class})
public class SearchModule {
    @Provides
    GankRepo provideGankRepo(GankApi gankApi) {
        return new GankRepo(gankApi);
    }
}
