package com.example.a10119230latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class AlmostThereActivity extends AppCompatActivity{

    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_almost_there);
        Objects.requireNonNull(getSupportActionBar()).hide();

        verifyBtn = findViewById(R.id.verify);

        verifyBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, VerifyActivity.class);
            startActivity(intent);
        });
    }
}

//NIM       : 10119230-->
//Nama      : Akmal Rizqulloh-->
//Kelas     : IF-6-->
//Tanggal Pengerjaan : 19-04-2023-->