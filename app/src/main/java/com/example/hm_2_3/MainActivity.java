package com.example.hm_2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartFragment startFragment = new StartFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container,startFragment)
                .commit();
    }
}