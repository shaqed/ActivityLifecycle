package com.example.shaked.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is a shortcut for setting the on click listener
        // on a button that I have no use for later
        findViewById(R.id.activityAButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Creation of the intent
        // Instantiation of the intent
        // the "this" argument is the Context which for now we blindly plug-in "this"
        // the SecondActivity.class is the target of the intent
        // and HAS TO END WITH .class !!!
        Intent intent = new Intent(this, SecondActivity.class);

        // load intent with some data
        intent.putExtra("X", "Secret recipe for pasta: ");

        // start a new activity here
        startActivity(intent);

        // any line of code you will write from here down
        // will probably not be executed so do not count on that

    }
}
