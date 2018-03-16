package cc.ibooker.zmvp.model;

import java.util.ArrayList;

import cc.ibooker.zmvp.bean.Person;

/**
 * 人物接口实现类
 * Created by 邹峰立 on 2018/3/16.
 */
public class PersonModelImpl implements PersonModel {

    // 从本地/网络访问获取数据
    @Override
    public void getPersonList(PersonModelListener personModelListener) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("张三", "张三张三张三张三张三张三张三张三张三张三张三"));
        list.add(new Person("李四", "李四李四李四李四李四李四李四李四李四李四李四"));
        list.add(new Person("王五", "王五王五王五王五王五王五王五王五王五王五王五"));
        list.add(new Person("赵六", "赵六赵六赵六赵六赵六赵六赵六赵六赵六赵六赵六"));
        list.add(new Person("钱七", "钱七钱七钱七钱七钱七钱七钱七钱七钱七钱七钱七"));
        list.add(new Person("孙八", "孙八孙八孙八孙八孙八孙八孙八孙八孙八孙八孙八"));
        list.add(new Person("周九", "周九周九周九周九周九周九周九周九周九周九周九"));
        list.add(new Person("吴十", "吴十吴十吴十吴十吴十吴十吴十吴十吴十吴十吴十"));

        if (personModelListener != null)
            personModelListener.onComplete(list);
    }

}
