package name.gudong.bootstrap.frame;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by GuDong on 10/12/2016 00:15.
 * Contact with gudong.name@gmail.com.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    P mPresenter;

    protected P getPresenter() {
        return mPresenter;
    }
}
