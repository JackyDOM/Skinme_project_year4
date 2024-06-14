package com.example.skinme.Auth_Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.skinme.R;
import com.example.skinme.SignIn_Screen.MainActivity;
import com.example.skinme.SignUp_Screen.SignUpActivity;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        //find by view ID
        Button btnSignIn = findViewById(R.id.btnSignIn);
        Button btnSignUp = findViewById(R.id.btnSignUp);

        //btnSignIn ClickOnListener
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSignInScreen();
            }
        });

        //btnSignUp ClickOnListener
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSignUpScreen();
            }
        });
    }

    public void GoToSignInScreen(){
        Intent intentSignIn = new Intent(this, MainActivity.class);
        startActivity(intentSignIn);
    }

    public void GoToSignUpScreen(){
        Intent intentSignUp = new Intent(this, SignUpActivity.class);
        startActivity(intentSignUp);
    }
}