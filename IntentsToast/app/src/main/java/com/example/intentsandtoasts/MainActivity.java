package com.example.intentsandtoasts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Romm db classes for insert delete update and list

    public void goToActivityB(View v){
        Intent intent = new Intent(MainActivity.this,ActivityB.class);
        startActivity(intent);
    }

    public void performToast(View v){
        Toast i = Toast.makeText(MainActivity.this,"a toast was started",Toast.LENGTH_LONG);
        i.show();
    }
}