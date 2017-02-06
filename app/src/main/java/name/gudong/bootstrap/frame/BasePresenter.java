package name.gudong.bootstrap.frame;

/**
 * Created by GuDong on 10/12/2016 00:20.
 * Contact with gudong.name@gmail.com.
 */

public abstract class BasePresenter <V extends MvpView> {
    private static final String TAG = "BasePresenter";
    private V mMvpView;

    public void attachView(V mvpView) {
        mMvpView = mvpView;
    }

    public void detachView() {
        mMvpView = null;
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V mvpView() {
        return mMvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
