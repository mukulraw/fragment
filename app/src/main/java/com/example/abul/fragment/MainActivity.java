package com.example.abul.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   RecyclerView recyclerview;
    GridLayoutManager manager;
    adapterclass adapter;




    List<Bean> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview=(RecyclerView)findViewById(R.id.ducat);
        adapter=new adapterclass(this,list);

        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(MainActivity.this));

        list = new ArrayList<>();
        manager=new GridLayoutManager(this,2);




        recyclerview.setLayoutManager(manager);
        recyclerview.setAdapter(adapter);






        Bean item1 = new Bean();
        item1.setName("Android");
        item1.setUrl("http://nationproducts.in/global/frontend_assets/images/product/20001039_2-24-mantra-organic-rice-sonamasuri-white-polished.jpg");

        list.add(item1);

        Bean item2 = new Bean();
        item2.setName("Windows");
        item2.setUrl("http://nationproducts.in/global/frontend_assets/images/product/279801_3-24-mantra-organic-powder-turmeric.jpg");

        list.add(item2);


        Bean item3 = new Bean();
        item3.setName("Ios");
        item3.setUrl("http://nationproducts.in/global/frontend_assets/images/product/20001057_3-24-mantra-organic-dal-green-moong-whole.jpg");

        list.add(item3);


        adapterclass adapter = new adapterclass(this,list);

        recyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();



        //  FragmentManager fm = getSupportFragmentManager();

        //FragmentTransaction ft=fm.beginTransaction();
        //Firstfragment f1=new Firstfragment();
        //Secondfragment f2=new Secondfragment();



        //WindowManager wm = getWindowManager();
        //Display d = wm.getDefaultDisplay();
        //int width = d.getWidth();
        //int height = d.getHeight();

        //if (width< height)
        //{
         //   ft.replace(R.id.replace,f1);
        //}
        //else
        //{
          //  ft.replace(R.id.replace , f2);
        //}





        //ft.commit();




    }
}
