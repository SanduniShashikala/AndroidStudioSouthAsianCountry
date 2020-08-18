package com.indrustrialmaster.southasiancountry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next(View v) {
        Intent intent = new Intent ( this, SecondActivity.class);
        startActivity(intent);
    }
    public void srilanka(View v) {
        Intent intent = new Intent ( this, ThirdActivity.class);
        startActivity(intent);
    }
    public void india(View v) {
        Intent intent = new Intent ( this, FourthActivity.class);
        startActivity(intent);
    }
    public void pakistan(View v) {
        Intent intent = new Intent ( this, FifthActivity.class);
        startActivity(intent);
    }
    public void maldivies(View v) {
        Intent intent = new Intent ( this, SixthActivity.class);
        startActivity(intent);
    }
}
