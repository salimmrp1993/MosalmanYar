package com.mosalmanyar.herotech.mosalmanyar.Fragments;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mosalmanyar.herotech.mosalmanyar.MainActivity;
import com.mosalmanyar.herotech.mosalmanyar.R;


public class FragmentCompass extends Fragment implements SensorEventListener {
    ImageView arrow;
    TextView tv_degreess;
    public static SensorManager sensorService;
    private Sensor sensor;
    private float correntdegress = 0f;
    private MainActivity mainActivity;



    public FragmentCompass() {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mainActivity = (MainActivity) activity;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_compass, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects her

        tv_degreess = (TextView)view.findViewById(R.id.tv_degress);
        arrow = view.findViewById(R.id.frd_compass);
    sensorService = (SensorManager) mainActivity.getSystemService(Context.SENSOR_SERVICE);
    sensor = sensorService.getDefaultSensor(Sensor.TYPE_ORIENTATION);


    }

    @Override
    public void onResume() {
        super.onResume();
        if (sensor != null){
            sensorService.registerListener(this,sensor,SensorManager.SENSOR_DELAY_FASTEST);

        }else {
            Toast.makeText(mainActivity, "گوشی شما فاقد سنسور قطب نما میباشد", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        sensorService.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
    int degree = Math.round(event.values[0]);
    tv_degreess.setText(Integer.toString(degree) + (char) 0x00B0);
        RotateAnimation ra = new RotateAnimation(correntdegress , -degree,
                Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        ra.setDuration(1000);
        ra.setFillAfter(true);
        arrow.startAnimation(ra);
        correntdegress = -degree;
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


}