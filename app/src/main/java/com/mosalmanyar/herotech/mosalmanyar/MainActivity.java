package com.mosalmanyar.herotech.mosalmanyar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.mosalmanyar.herotech.mosalmanyar.Fragments.DoaFragment;
import com.mosalmanyar.herotech.mosalmanyar.Fragments.FragmentCompass;
import com.mosalmanyar.herotech.mosalmanyar.Fragments.TasbihFragment;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ست کردن باتوم ناویگیشن
        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_nav);
        fragmentManager = getSupportFragmentManager();
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.item_praye:
                        fragment = new FragmentCompass();
                        break;
                    case R.id.item_tasbih:
                        fragment = new TasbihFragment();
                        break;
                    case R.id.item_compase:
                        fragment = new DoaFragment();
                        break;
                    case R.id.item_doa:
                        fragment = new DoaFragment();
                        break;
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }
}
