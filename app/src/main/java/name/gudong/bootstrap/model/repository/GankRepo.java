package name.gudong.bootstrap.model.repository;

import javax.inject.Inject;

import io.reactivex.Observable;
import name.gudong.bootstrap.model.GankApi;
import name.gudong.model.entity.GankList;

/**
 * Created by GuDong on 10/12/2016 00:37.
 * Contact with gudong.name@gmail.com.
 */

public class GankRepo {
    GankApi mApi;
    @Inject
    public GankRepo(GankApi gankApi) {
        this.mApi = gankApi;
    }

    public Observable<GankList> searchGank(String query){
        return mApi.searchGank(query,"Android",10,10);
    }
}
