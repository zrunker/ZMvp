package cc.ibooker.zmvp.view;

import java.util.ArrayList;

import cc.ibooker.zmvp.bean.Person;

/**
 * 人物 界面 接口
 * Created by 邹峰立 on 2018/3/16.
 */
public interface IMainView {

    // 展示加载数据Toast
    void showLoadToast();

    // 展示数据（使用回调的方式还回数据）
    void showData(ArrayList<Person> list);
}
