package name.gudong.model;

import io.reactivex.Observable;
import name.gudong.model.entity.GankList;

/**
 * Created by GuDong on 10/12/2016 00:37.
 * Contact with gudong.name@gmail.com.
 */

public class GankRepo {
    GankApi mApi;

    public GankRepo(GankApi gankApi) {
        this.mApi = gankApi;
    }

    public Observable<GankList> searchGank(String query) {
        return mApi.searchGank(query, "Android", 10, 10);
    }
}
