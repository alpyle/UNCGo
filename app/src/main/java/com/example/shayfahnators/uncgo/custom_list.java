package com.example.shayfahnators.uncgo;

import android.app.ListActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sarah on 2/17/2015.
 */
public class custom_list extends BaseAdapter {

// creates the outline for a ListView that takes in Objects instead of Strings

    private ArrayList<String> listData;
    private LayoutInflater layoutInflater;

    public custom_list(Context aContext, ArrayList<String> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }


    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.activity_list_view, null);
            holder = new ViewHolder();
            holder.headlineView = (TextView) convertView.findViewById(R.id.name);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.headlineView.setText(listData.get(position));
        return convertView;
    }

    private class ViewHolder {
        TextView headlineView;
        TextView className;
    }
}


