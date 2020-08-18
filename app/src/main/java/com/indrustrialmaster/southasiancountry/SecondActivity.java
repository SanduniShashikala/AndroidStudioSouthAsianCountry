package com.indrustrialmaster.southasiancountry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void bangaladesh(View v) {
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }
    public void afganistan(View v) {
        Intent intent = new Intent(this, NinethActivity.class);
        startActivity(intent);

    }
    public void nepal(View v) {
        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }
    public void bhutan(View v) {
        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }
    public void back(View v) {
        Intent intent = new Intent ( this, MainActivity.class);
        startActivity(intent);
    }
}
