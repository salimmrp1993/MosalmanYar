package com.mosalmanyar.herotech.mosalmanyar.Fragments;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.mosalmanyar.herotech.mosalmanyar.Doas_list;
import com.mosalmanyar.herotech.mosalmanyar.R;

public class DoaFragment extends Fragment implements View.OnClickListener {
    ImageView img_good,img_home,img_haj,img_joy,img_evning,img_nature,img_travel,img_pray,img_allah,img_death,img_food,img_all;

    public DoaFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.activity_doa_fragment, container, false);
        img_all = (ImageView)v.findViewById(R.id.img_all);
        img_all.setOnClickListener(this);

        return v;
    }




@Override
    public void onClick(View v){
    switch (v.getId()) {
        case R.id.img_all:
            Intent intent = new Intent(getActivity(), Doas_list.class);
            startActivity(intent);
            break;



        }

    }


}