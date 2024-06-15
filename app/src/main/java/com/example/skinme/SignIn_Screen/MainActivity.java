package com.example.skinme.SignIn_Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.skinme.ButtomNavigationBar.HomeScreenActivity;
import com.example.skinme.R;
import com.example.skinme.SignUp_Screen.SignUpActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtRegister;
    private Button btnSignIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRegister = findViewById(R.id.txtRegister);
        btnSignIN = findViewById(R.id.btnSignIn);

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSignUp();
            }
        });

        btnSignIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToHome();
            }
        });

    }

    public void GoToSignUp(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void GoToHome(){
        Intent intentHomeScreen = new Intent(this, HomeScreenActivity.class);
        startActivity(intentHomeScreen);
    }
}