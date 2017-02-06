package name.gudong.bootstrap;

import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import name.gudong.bootstrap.frame.BaseActivity;
import name.gudong.bootstrap.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> {

    @BindView(R.id.btn_main_get_data)
    Button mBtnMainGetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_main_get_data)
    public void onClick() {
        getPresenter().loadUserInfo();
    }
}
