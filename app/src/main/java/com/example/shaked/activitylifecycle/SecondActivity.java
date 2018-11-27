package com.example.shaked.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent sentIntent = getIntent();

        String ans = sentIntent.getStringExtra("X");
        if (ans != null) {
            Toast.makeText(this, "the ans is : " + ans, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "The ans is null", Toast.LENGTH_SHORT).show();
        }


    }
}
