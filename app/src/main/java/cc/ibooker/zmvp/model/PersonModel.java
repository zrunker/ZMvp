package cc.ibooker.zmvp.model;

import java.util.ArrayList;

import cc.ibooker.zmvp.bean.Person;

/**
 * 人物 model 接口
 * <p>
 * Created by 邹峰立 on 2018/3/16.
 */
public interface PersonModel {

    /**
     * 获取人物消息列表
     */
    void getPersonList(PersonModelListener personModelListener);

    // 定义回调接口 - 避免网络数据延迟
    interface PersonModelListener {
        void onComplete(ArrayList<Person> list);
    }

}
