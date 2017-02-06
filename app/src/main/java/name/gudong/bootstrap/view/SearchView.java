package name.gudong.bootstrap.view;

import android.support.annotation.UiThread;

import name.gudong.bootstrap.frame.MvpView;

@UiThread
public interface SearchView extends MvpView {

    /**
     * show size for result
     * @param size size
     */
    void showResultSize(int size);
}