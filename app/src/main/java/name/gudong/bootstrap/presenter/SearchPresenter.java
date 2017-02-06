package name.gudong.bootstrap.presenter;

import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import name.gudong.bootstrap.frame.BasePresenter;
import name.gudong.bootstrap.model.data.GankList;
import name.gudong.bootstrap.model.repository.GankRepo;
import name.gudong.bootstrap.view.SearchView;


public final class SearchPresenter extends BasePresenter<SearchView> {
    private static final String TAG = "SearchPresenter";
    GankRepo repo;

    @Inject
    public SearchPresenter(GankRepo repo) {
        this.repo = repo;
    }


    public void searchGankInfo(String key) {
        repo.searchGank(key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<GankList>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG, "msg onSubscribe");
            }

            @Override
            public void onNext(GankList value) {
                Log.i(TAG, "msg onNext");
                Toast.makeText(mvpView().getMvpContext(), "get data suc", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "value size " + value.results.size());
                mvpView().showResultSize(value.results.size());
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "msg " + e.getMessage());
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "msg onComplete");
            }
        });

    }
}