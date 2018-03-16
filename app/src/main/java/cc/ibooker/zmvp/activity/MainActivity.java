package cc.ibooker.zmvp.activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import cc.ibooker.zmvp.R;
import cc.ibooker.zmvp.adapter.MainLvAdapter;
import cc.ibooker.zmvp.bean.Person;
import cc.ibooker.zmvp.presenter.MainPresenter;
import cc.ibooker.zmvp.view.IMainView;

/**
 * MVP构架实践
 */
public class MainActivity extends BaseActivity<IMainView, MainPresenter<IMainView>> implements IMainView {
    private ListView listView;
    private MainLvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        basePresenter.bindData();
    }

    @Override
    protected MainPresenter<IMainView> initPresenter() {
        return new MainPresenter<>();
    }

    @Override
    public void showLoadToast() {
        Toast.makeText(this, "加载数据...", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showData(ArrayList<Person> list) {
        setAdapter(list);
    }

    // 自定义setAdapter
    public void setAdapter(ArrayList<Person> list) {
        if (adapter == null) {
            adapter = new MainLvAdapter(MainActivity.this, list);
            listView.setAdapter(adapter);
        } else {
            adapter.reflashData(list);
        }
    }
}
