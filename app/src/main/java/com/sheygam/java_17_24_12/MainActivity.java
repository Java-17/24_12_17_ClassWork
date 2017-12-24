package com.sheygam.java_17_24_12;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startSecond = findViewById(R.id.start_second_btn);
        startSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("telran.java17.first.action");
                Intent chooser = Intent.createChooser(intent,"Choice App");
                startActivity(chooser);

            }
        });

        Button startThird = findViewById(R.id.start_third_btn);
        startThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("telran.java17.second.action");
                startActivity(intent);
            }
        });

        Button openLink = findViewById(R.id.open_link_btn);
        openLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

//        openLink.setVisibility(View.VISIBLE|View.INVISIBLE|View.GONE);
    }
}
