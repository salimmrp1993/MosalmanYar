package com.mosalmanyar.herotech.mosalmanyar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mosalmanyar.herotech.mosalmanyar.Adapter.DoaAdpter;
import com.mosalmanyar.herotech.mosalmanyar.Models.Doas;

import java.util.ArrayList;
import java.util.List;

public class Doas_list extends AppCompatActivity {
    private List<Doas> doas = new ArrayList<>();
    private RecyclerView  recyclerView;
    private DoaAdpter doaAdpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doas_list);
        recyclerView = findViewById(R.id.recikler_doa);
        doaAdpter = new DoaAdpter(doas);
        recyclerView.setLayoutManager(new LinearLayoutManager(Doas_list.this));
        recyclerView.setAdapter(doaAdpter);
        setdata();
    }
    private void setdata(){
        doas.add(new Doas("1.",getString(R.string.list_doas_1) ));
        doas.add(new Doas("2.",getString(R.string.list_doas_2) ));
        doas.add(new Doas("3.",getString(R.string.list_doas_3) ));
        doas.add(new Doas("4.",getString(R.string.list_doas_4) ));
        doas.add(new Doas("4.",getString(R.string.list_doas_5) ));
        doas.add(new Doas("4.",getString(R.string.list_doas_6) ));
        doas.add(new Doas("4.",getString(R.string.list_doas_7) ));
        doas.add(new Doas("5.",getString(R.string.list_doas_8) ));
        doas.add(new Doas("6.",getString(R.string.list_doas_9) ));
        doas.add(new Doas("7.",getString(R.string.list_doas_10) ));
        doas.add(new Doas("8.",getString(R.string.list_doas_11) ));
        doas.add(new Doas("9.",getString(R.string.list_doas_12) ));
        doas.add(new Doas("10.",getString(R.string.list_doas_13) ));
        doas.add(new Doas("11.",getString(R.string.list_doas_14) ));
        doas.add(new Doas("12.",getString(R.string.list_doas_15) ));
        doas.add(new Doas("13.",getString(R.string.list_doas_16) ));
        doas.add(new Doas("14.",getString(R.string.list_doas_17) ));
        doas.add(new Doas("15.",getString(R.string.list_doas_18) ));
        doas.add(new Doas("16.",getString(R.string.list_doas_19) ));
        doas.add(new Doas("17",getString(R.string.list_doas_20) ));
        doas.add(new Doas("18.",getString(R.string.list_doas_21) ));
        doas.add(new Doas("19.",getString(R.string.list_doas_22) ));
        doas.add(new Doas("20.",getString(R.string.list_doas_23) ));
        doas.add(new Doas("21.",getString(R.string.list_doas_24) ));
        doas.add(new Doas("22.",getString(R.string.list_doas_25) ));
        doas.add(new Doas("23.",getString(R.string.list_doas_26) ));
        doas.add(new Doas("24.",getString(R.string.list_doas_27) ));
        doas.add(new Doas("25.",getString(R.string.list_doas_28) ));
        doas.add(new Doas("26.",getString(R.string.list_doas_29) ));
        doas.add(new Doas("27.",getString(R.string.list_doas_30) ));
        doas.add(new Doas("28.",getString(R.string.list_doas_31) ));
        doas.add(new Doas("29.",getString(R.string.list_doas_32) ));
        doas.add(new Doas("30.",getString(R.string.list_doas_33) ));
        doas.add(new Doas("31.",getString(R.string.list_doas_34) ));
        doas.add(new Doas("32.",getString(R.string.list_doas_35) ));
        doas.add(new Doas("33.",getString(R.string.list_doas_36) ));
        doas.add(new Doas("34.",getString(R.string.list_doas_37) ));
        doas.add(new Doas("35.",getString(R.string.list_doas_38) ));
        doas.add(new Doas("36.",getString(R.string.list_doas_39) ));
        doas.add(new Doas("37.",getString(R.string.list_doas_40) ));
        doas.add(new Doas("38.",getString(R.string.list_doas_41) ));
        doas.add(new Doas("39.",getString(R.string.list_doas_42) ));
        doas.add(new Doas("40.",getString(R.string.list_doas_43) ));
        doas.add(new Doas("41.",getString(R.string.list_doas_44) ));
        doas.add(new Doas("42.",getString(R.string.list_doas_45) ));
        doas.add(new Doas("43.",getString(R.string.list_doas_46) ));
        doas.add(new Doas("44.",getString(R.string.list_doas_47) ));
        doas.add(new Doas("45.",getString(R.string.list_doas_48) ));
        doas.add(new Doas("46.",getString(R.string.list_doas_49) ));
        doas.add(new Doas("47.",getString(R.string.list_doas_50) ));
        doas.add(new Doas("48.",getString(R.string.list_doas_51) ));
        doas.add(new Doas("49.",getString(R.string.list_doas_52) ));
        doas.add(new Doas("50.",getString(R.string.list_doas_53) ));
        doas.add(new Doas("51.",getString(R.string.list_doas_54) ));
        doas.add(new Doas("52.",getString(R.string.list_doas_55) ));
        doas.add(new Doas("53.",getString(R.string.list_doas_56) ));
        doas.add(new Doas("54.",getString(R.string.list_doas_57) ));
        doas.add(new Doas("55.",getString(R.string.list_doas_58) ));
        doas.add(new Doas("56.",getString(R.string.list_doas_59) ));
        doas.add(new Doas("57.",getString(R.string.list_doas_60) ));
        doas.add(new Doas("58.",getString(R.string.list_doas_61) ));
        doas.add(new Doas("59.",getString(R.string.list_doas_62) ));
        doas.add(new Doas("60.",getString(R.string.list_doas_63) ));
        doas.add(new Doas("61.",getString(R.string.list_doas_64) ));
        doas.add(new Doas("62.",getString(R.string.list_doas_65) ));
        doas.add(new Doas("63.",getString(R.string.list_doas_66) ));
        doas.add(new Doas("64.",getString(R.string.list_doas_67) ));
        doas.add(new Doas("65.",getString(R.string.list_doas_68) ));
        doas.add(new Doas("66.",getString(R.string.list_doas_69) ));
        doas.add(new Doas("67.",getString(R.string.list_doas_70) ));
        doas.add(new Doas("68.",getString(R.string.list_doas_71) ));
        doas.add(new Doas("69.",getString(R.string.list_doas_75) ));
        doas.add(new Doas("70.",getString(R.string.list_doas_73) ));
        doas.add(new Doas("71.",getString(R.string.list_doas_74) ));
        doas.add(new Doas("72.",getString(R.string.list_doas_75) ));
        doas.add(new Doas("73.",getString(R.string.list_doas_76) ));
        doas.add(new Doas("74.",getString(R.string.list_doas_77) ));
        doas.add(new Doas("75.",getString(R.string.list_doas_78) ));
        doas.add(new Doas("76.",getString(R.string.list_doas_79) ));
        doas.add(new Doas("77.",getString(R.string.list_doas_80) ));
        doas.add(new Doas("78.",getString(R.string.list_doas_81) ));
        doas.add(new Doas("79.",getString(R.string.list_doas_82) ));
        doas.add(new Doas("80.",getString(R.string.list_doas_83) ));

        doaAdpter.notifyDataSetChanged();
    }
}

