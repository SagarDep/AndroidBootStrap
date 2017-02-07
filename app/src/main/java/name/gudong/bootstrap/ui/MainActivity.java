package name.gudong.bootstrap.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import name.gudong.bootstrap.R;
import name.gudong.bootstrap.component.DaggerMainComponent;
import name.gudong.bootstrap.frame.BaseActivity;
import name.gudong.bootstrap.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> {

    @BindView(R.id.activity_main)
    FrameLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().build().inject(this);
        ButterKnife.bind(this);

        Fragment fragment = new SearchFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment).commit();
    }

}
