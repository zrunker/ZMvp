package cc.ibooker.zmvp.presenter;

import java.lang.ref.WeakReference;

/**
 * Presenter基类
 * <p>
 * T 视图实现接口
 * <p>
 * Created by 邹峰立 on 2018/3/16.
 */
public class BasePresenter<V> {

    WeakReference<V> mViewRef;

    // 绑定mViewRef
    public void attachView(V view) {
        mViewRef = new WeakReference<>(view);
    }

    // mViewRef解绑
    public void detachView() {
        mViewRef.clear();
    }
}
