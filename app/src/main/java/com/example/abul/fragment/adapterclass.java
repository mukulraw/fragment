package com.example.abul.fragment;

import android.content.Context;
import android.content.Loader;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import static android.R.id.list;

/**
 * Created by Abul on 1/9/2017.
 */

public class adapterclass  extends RecyclerView.Adapter<adapterclass.MyViewHolder> {


    Context context;
    List<Bean> list = new ArrayList<>();
    int resourcesid;
    LayoutInflater inflater;


    public adapterclass(Context context, List<Bean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_model, parent, false);
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        Bean item = list.get(position);
        holder.name.setText(item.getName());
        holder.url.setText(item.getUrl());
        ImageLoader loader =ImageLoader.getInstance();
        loader.displayImage(item.getUrl(), holder.image);


    }

    @Override
    public int getItemCount() {
       return list.size();
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, url;
        ImageView image;


        public MyViewHolder(View itemView) {


            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            url = (TextView) itemView.findViewById(R.id.url);


        }

    }
}





