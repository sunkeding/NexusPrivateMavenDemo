package com.sdu.didi.testuploadmymaven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sdu.didi.utillib.FirstUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstUtil.helloWorld();
    }
}
