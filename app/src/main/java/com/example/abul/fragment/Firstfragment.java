package com.example.abul.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.abul.fragment.MainActivity;
import com.example.abul.fragment.R;



public class Firstfragment extends Fragment {
    Button buttonswitch;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_layout, container, false);
        buttonswitch = (Button) view.findViewById(R.id.switcher);


        buttonswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Hello", Toast.LENGTH_LONG).show();


            }
        });


        return view;

    }
}
