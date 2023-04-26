package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");


        Context context = getApplicationContext();
        CharSequence text = "onCreate invoked";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart invoked");

        Context context = getApplicationContext();
        CharSequence text = "onStart  invoked";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifecycle","onResume invoked");

        Context context = getApplicationContext();
        CharSequence text = "onResume  invoked";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle","onPause invoked");

        Context context = getApplicationContext();
        CharSequence text = "onPause  invoked";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","onStop invoked");

        Context context = getApplicationContext();
        CharSequence text = "onStop  invoked";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");

        Context context = getApplicationContext();
        CharSequence text = "onRestart  invoked";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");

        Context context = getApplicationContext();
        CharSequence text = "onDestroy  invoked";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}