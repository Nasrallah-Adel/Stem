package com.be_happy.nasrallah.steam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class tow extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tow);

    }
    void dor(View v){

        Intent i = new Intent(tow.this, dor.class);
        startActivity(i);
    } void bre(View v){

        Intent i = new Intent(tow.this, bre.class);
        startActivity(i);
    }
}
