package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtvMsg2 = findViewById(R.id.tvMsg2);
        txtvMsg2.setText(R.string.Msg2);

        Log.i(tag:"Lifecycle",msg: "OnCreate() Invoked...");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(tag:"Lifecycle" , msg:"Onstart called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(tag:"Lifrcycle" , msg:"Onresume called...");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(tag:"Lifrcycle" , msg:"Onpause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(tag:"Lifrcycle" , msg:"Onstop called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(tag:"Lifrcycle" , msg:"Ondestroy called...");
    }
}