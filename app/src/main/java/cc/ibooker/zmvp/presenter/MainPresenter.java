package cc.ibooker.zmvp.presenter;

import java.util.ArrayList;

import cc.ibooker.zmvp.bean.Person;
import cc.ibooker.zmvp.model.PersonModel;
import cc.ibooker.zmvp.model.PersonModelImpl;
import cc.ibooker.zmvp.view.IMainView;

/**
 * 人物 Presenter
 * Created by 邹峰立 on 2018/3/16.
 */
public class MainPresenter<T extends IMainView> extends BasePresenter<T> {

    // model层
    private PersonModel personModel = new PersonModelImpl();

    // 绑定数据
    public void bindData() {
        if (mViewRef.get() != null) {
            mViewRef.get().showLoadToast();
            if (personModel != null) {
                personModel.getPersonList(new PersonModel.PersonModelListener() {
                    @Override
                    public void onComplete(ArrayList<Person> list) {
                        mViewRef.get().showData(list);
                    }
                });
            }
        }
    }
}
