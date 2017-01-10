package com.example.abul.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abul.fragment.R;

import java.util.zip.Inflater;

/**
 * Created by Abul on 1/7/2017.
 */

public class Secondfragment  extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate (R.layout.secondlayout,container,false);
        return v;
    }
}
