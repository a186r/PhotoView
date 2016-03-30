package com.durs.photoview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv_kindergarten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerListener();
    }

    private void init() {
        lv_kindergarten = (ListView)findViewById(R.id.lv_kindergarten);
    }

    private void registerListener(){

    }


}
