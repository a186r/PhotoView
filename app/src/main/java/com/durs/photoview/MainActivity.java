package com.durs.photoview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_tolist;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerListener();
    }

    private void init() {
        btn_tolist = (Button) findViewById(R.id.btn_tolist);
    }

    private void registerListener() {
        btn_tolist.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tolist:
                intent = new Intent(this, MListView.class);
                startActivity(intent);
                break;
        }

    }
}
