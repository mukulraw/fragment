package com.example.abul.fragment;

import android.content.Context;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends BaseAdapter{


    Context context;
    List<DataBean> list = new ArrayList<>();
    int resourceId;
    LayoutInflater inflater;

    public DataAdapter(Context context , int resourceId , List<DataBean> list)
    {
        this.context = context;
        this.list = list;
        this.resourceId = resourceId;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        DataBean item = list.get(position);





            convertView = inflater.inflate(resourceId , null);
            ImageView image = (ImageView)convertView.findViewById(R.id.image);
            TextView name = (TextView)convertView.findViewById(R.id.name);
            TextView url = (TextView)convertView.findViewById(R.id.url);


        ImageLoader loader = ImageLoader.getInstance();

        loader.displayImage(item.getUrl() , image);



        name.setText(item.getName());
        url.setText(item.getUrl());



//        name.setText(data[position]);





        return convertView;
    }



}
