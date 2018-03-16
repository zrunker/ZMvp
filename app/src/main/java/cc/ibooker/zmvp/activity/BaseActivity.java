package cc.ibooker.zmvp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cc.ibooker.zmvp.presenter.BasePresenter;

/**
 * Activity 基类
 * Created by 邹峰立 on 2018/3/16.
 */
public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {

    T basePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basePresenter = initPresenter();
        basePresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.detachView();
    }

    // 初始化Presenter
    protected abstract T initPresenter();
}
