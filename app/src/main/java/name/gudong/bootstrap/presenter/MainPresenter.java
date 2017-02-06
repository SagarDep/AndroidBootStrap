package name.gudong.bootstrap.presenter;

import name.gudong.bootstrap.domain.UserApi;
import name.gudong.bootstrap.frame.BasePresenter;
import name.gudong.bootstrap.model.data.UserEntity;

/**
 * Created by GuDong on 10/12/2016 00:20.
 * Contact with gudong.name@gmail.com.
 */

public class MainPresenter extends BasePresenter {
    private UserApi mUserApi;

    public void loadUserInfo() {
        UserEntity entity = mUserApi.loadUserInfo();
    }
}
