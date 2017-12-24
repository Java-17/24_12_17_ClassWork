package com.sheygam.java_17_24_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        if(intent.getAction().contains("second")){
            Toast.makeText(this, "Was started with second action", Toast.LENGTH_SHORT).show();
        }else if(intent.getAction().contains("first")){
            Toast.makeText(this, "Was started with first action", Toast.LENGTH_SHORT).show();
        }
    }
}
