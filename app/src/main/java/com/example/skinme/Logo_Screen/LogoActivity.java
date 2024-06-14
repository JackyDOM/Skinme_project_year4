package com.example.skinme.Logo_Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.skinme.Auth_Screen.AuthActivity;
import com.example.skinme.R;
import com.example.skinme.SignIn_Screen.MainActivity;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LogoActivity.this, AuthActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }

}