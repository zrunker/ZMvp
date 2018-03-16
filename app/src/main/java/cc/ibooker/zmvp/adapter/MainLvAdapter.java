package cc.ibooker.zmvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import cc.ibooker.zmvp.R;
import cc.ibooker.zmvp.bean.Person;

/**
 * 人物Adapter
 *
 * Created by 邹峰立 on 2018/3/16.
 */
public class MainLvAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Person> mDatas;

    public MainLvAdapter(Context context, ArrayList<Person> list) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.mDatas = list;
    }

    public void reflashData(ArrayList<Person> list) {
        this.mDatas = list;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.activity_main_lv_item, parent, false);
            holder.nameTv = convertView.findViewById(R.id.tv_name);
            holder.addressTv = convertView.findViewById(R.id.tv_address);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Person person = mDatas.get(position);
        holder.nameTv.setText(person.getName());
        holder.addressTv.setText(person.getAddress());
        return convertView;
    }

    static class ViewHolder {
        TextView nameTv, addressTv;
    }
}
