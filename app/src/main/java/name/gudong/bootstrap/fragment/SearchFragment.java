package name.gudong.bootstrap.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import name.gudong.bootstrap.R;
import name.gudong.bootstrap.component.DaggerSearchComponent;
import name.gudong.bootstrap.frame.BaseFragment;
import name.gudong.bootstrap.presenter.SearchPresenter;
import name.gudong.bootstrap.view.SearchView;


public final class SearchFragment extends BaseFragment<SearchPresenter> implements SearchView {

    @BindView(R.id.bt_action)
    Button mBtAction;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerSearchComponent.builder().build().inject(this);
        mPresenter.attachView(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_layout_search, null);
        ButterKnife.bind(this, view);
        mBtAction = ButterKnife.findById(view, R.id.bt_action);
        mBtAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.searchGankInfo("rxJava");
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //TODO update view or set data
    }


    @Override
    public void showResultSize(int size) {
        mBtAction.setText("" + size);
    }
}
