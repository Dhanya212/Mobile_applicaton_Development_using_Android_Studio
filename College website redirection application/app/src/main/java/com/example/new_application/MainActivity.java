package com.example.new_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button babout,bloc,bcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        babout=findViewById(R.id.button);
        bloc=findViewById(R.id.button2);
        bcon=findViewById(R.id.button3);
        babout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="www.ajiet.edu.in/pages/aboutus/";
                Uri u=Uri.parse("http:/"+url);
                Intent i=new Intent(Intent.ACTION_VIEW,u);
                startActivity(i);


            }
        });
        bcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call="824 2862200";
                Uri u=Uri.parse("tel:"+call);
                Intent i=new Intent(Intent.ACTION_VIEW,u);
                startActivity(i);

            }
        });
        bloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String loc="A J Institute of Engineering and Technology";
                Uri u=Uri.parse("geo:?q="+loc);
                Intent i=new Intent(Intent.ACTION_VIEW,u);
                startActivity(i);

            }
        });


    }
}