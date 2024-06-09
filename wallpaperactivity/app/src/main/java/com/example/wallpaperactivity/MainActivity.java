package com.example.wallpaperactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
Button changewallpaper;
Timer mytimer;
Drawable drawable;
WallpaperManager wpn;
int prev=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytimer=new Timer();
        wpn=WallpaperManager.getInstance(this);
        changewallpaper=findViewById(R.id.button);
        changewallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setWallpaper();
            }
        });
    }
    private  void setWallpaper(){
        mytimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(prev==1){
                    drawable=getResources().getDrawable(R.drawable.abc5);
                    prev=2;
                }

                else if (prev==2){
                    drawable=getResources().getDrawable(R.drawable.abc1);
                    prev=3;
                }
                else if (prev==3){
                    drawable=getResources().getDrawable(R.drawable.abc2);
                    prev=4;
                }
                else if (prev==4){
                    drawable=getResources().getDrawable(R.drawable.abc3);
                    prev=5;
                }
                else if (prev==5){
                    drawable=getResources().getDrawable(R.drawable.abc4);
                    prev=1;

                }
                Bitmap wp=((BitmapDrawable)drawable).getBitmap();
                try {
                    wpn.setBitmap(wp);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        },0,30000);
    }
}