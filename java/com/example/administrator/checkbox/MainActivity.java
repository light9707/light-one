package com.example.administrator.checkbox;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private CheckBox mCb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCb5 = (CheckBox) findViewById(R.id.cb5) ;
            mCb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    Toast.makeText(MainActivity.this,isChecked? "我是toast":"我不是toast", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }





