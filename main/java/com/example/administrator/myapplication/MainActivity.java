package com.example.administrator.myapplication;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView mS1;
    private  TextView mS4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mS4= findViewById(R.id.S4);
        mS4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mS4.getPaint().setAntiAlias(true);

    }
}
