package com.indrustrialmaster.southasiancountry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TenthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
    }
    public void back(View v) {
        Intent intent = new Intent ( this, SecondActivity.class);
        startActivity(intent);
    }
}
