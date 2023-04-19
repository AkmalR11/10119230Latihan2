package com.example.a10119230latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}

//NIM       : 10119230
//Nama      : Akmal Rizqulloh
//Kelas     : IF-6
//Tanggal Pengerjaan : 19-04-2023