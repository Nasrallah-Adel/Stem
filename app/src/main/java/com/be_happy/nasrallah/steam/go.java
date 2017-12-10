package com.be_happy.nasrallah.steam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class go extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
        Intent intent = getIntent();
        List<String> test = (ArrayList<String>) intent.getStringArrayListExtra("list");
        Bundle extras = getIntent().getExtras();

        String car = extras.getString("car");

        context = this;
        String[] b = new String[test.size()];
        b = test.toArray(b);
        System.out.println(test.size());
        EditText e = (EditText) findViewById(R.id.car);
        e.setText(car);
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, b));

    }
}
