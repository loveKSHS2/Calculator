package com.example.seunghyun.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tx = (TextView)findViewById(R.id.textview_exp_list);

        Intent intent = getIntent();

        //String expression = intent.getExtras().getString("expression");
        //String result = intent.getExtras().getString("result");
        String log = intent.getExtras().getString("log");

        log = log.replace("s","sin");
        log = log.replace("c","cos");
        log = log.replace("t","tan");
        log = log.replace("l","log");
        tx.setText(log);

    }
}
