package com.mosalmanyar.herotech.mosalmanyar.Fragments;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.mosalmanyar.herotech.mosalmanyar.R;



public class TasbihFragment extends Fragment implements OnClickListener{
    TextView tv_tasbih,tv_counter,tv_ts;
    Button bt_tasbih;
    int counte = 0;
    int reset = 0;
    MediaPlayer mp;
    Vibrator v;
    int ts;
    private boolean size;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
   View v = inflater.inflate(R.layout.activity_tasbih_fragment, container, false);
        tv_counter = (TextView) v.findViewById(R.id.tv_counter);
        tv_tasbih = (TextView) v.findViewById(R.id.tv_tasbih);
        tv_ts = v.findViewById(R.id.tv_ts);
        bt_tasbih = (Button)v.findViewById(R.id.bt_tasbih);
        mp = MediaPlayer.create(getActivity(),( R.raw.tick));
        bt_tasbih.setOnClickListener(this);

return v;
    }
    //موقع کلیک باتن تسبییح
    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.bt_tasbih:
        plus();
        setTv();
        vibre();
        break;
}

    }
    public int plus(){
        if (reset <= 32  ) {
            reset++;
            tv_tasbih.setText("سبحان الله");
            counte++;
        }
else if ( reset >= 32 && reset <= 64){
            reset++;
            counte++;
            tv_tasbih.setText("الحمد لله");

        }
        else if ( reset >= 64 && reset <= 94){
            reset++;
            counte++;
            tv_tasbih.setText("الله اکبر");


        }
        else if ( reset >= 94 &&reset <= 95 ){
            reset++;
            counte++;
            tv_tasbih.setTextSize(15);
            tv_tasbih.setPadding(170,0,170,0);
            tv_tasbih.setText("لا اله الا الله وحده لا شریک له له الملک وله الحمد یحیی و یمیت وهو حی لا یموت بیده الخیر و هو علی کلل شی قدیر");

        }
        else if ( reset >= 95 && reset <= 105) {
            reset++;
            counte++;
            tv_tasbih.setTextSize(36);
            tv_tasbih.setText("لا اله الا الله");
        }
             else if ( reset >= 105 && reset <= 106) {
            reset++;
            counte++;
            tv_tasbih.setTextSize(36);
            tv_tasbih.setText("محمد رسول الله");
        }



        else if ( reset >= 106 && reset <= 116){
            reset++;
            counte++;
            tv_tasbih.setTextSize(20);
            tv_tasbih.setText("اللهم صل علی سیدنا محمد و علی اله و صحبه و سلم");
        }
        else if ( reset >= 116 && reset <= 216){
            reset++;
            counte++;
            tv_tasbih.setTextSize(36);
            tv_tasbih.setText("استغفرالله");
        }
        else if ( reset >= 216 && reset <= 236){
            reset++;
            counte++;
            tv_tasbih.setTextSize(36);
            tv_tasbih.setText("یا هادی");
        }
        else if ( reset >= 236 && reset <= 246){
            reset++;
            counte++;
            tv_tasbih.setTextSize(20);
            tv_tasbih.setText("اللهم صل علی سیدنا محمد و علی اله و صحبه و سلم");
        }


      return counte;
    }
    //شمارنده اصلی مدیا پلیر و  تغییر متن
public void setTv ( ){
        tv_counter.setText(counte+"");
        mp.start();

}

//تغییر متن شمارش و ویبره زدن
    public void vibre(){

        if (reset == 33  ){
            tv_ts.setText("33");
        Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(400);
        }
        else if (reset == 66){
            tv_ts.setText("34");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
        else if (reset == 96){
            tv_ts.setText("1");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
        else if (reset == 97){
            tv_ts.setText("10");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
        else if (reset == 107){
            tv_ts.setText("1");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
        else if (reset == 108){
            tv_ts.setText("10");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
        else if (reset == 118){
            tv_ts.setText("100");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
        else if (reset == 218){
            tv_ts.setText("20");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
        else if (reset == 238){
            tv_ts.setText("10");
            Vibrator v = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(400);
        }
    }


    // تغییر با دکمه صدا
}







