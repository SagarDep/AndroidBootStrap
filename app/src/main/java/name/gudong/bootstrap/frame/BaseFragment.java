package name.gudong.bootstrap.frame;

import android.content.Context;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

/**
 * Created by GuDong on 10/12/2016 00:15.
 * Contact with gudong.name@gmail.com.
 */

public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements MvpView {
    @Inject
    protected P mPresenter;

    protected P getPresenter() {
        return mPresenter;
    }

    @Override
    public Context getMvpContext() {
        return getActivity();
    }
}
