package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRR","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("RRRRR","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("RRRRR","onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("RRRRR","onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("RRRRR","onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("RRRRR","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("RRRRR","onStop()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
