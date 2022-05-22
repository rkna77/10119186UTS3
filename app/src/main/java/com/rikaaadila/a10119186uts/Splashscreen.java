package com.rikaaadila.a10119186uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

///<!--
//Tanggal Pengerjaan : 15/5/2022 NIM : 10119186 Nama : Rika Nur'adila Kelas : IF-5
//-->
public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        int SPLASH_TIME=3000; // 3 detik

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                Splashscreen.this.startActivity(intent);
                Splashscreen.this.finish();
            }
        }, SPLASH_TIME);
    }
}