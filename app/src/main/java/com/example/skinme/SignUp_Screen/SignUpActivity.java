package com.example.skinme.SignUp_Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.skinme.R;
import com.example.skinme.SignIn_Screen.MainActivity;

public class SignUpActivity extends AppCompatActivity {
    private ImageView imgLeftArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        imgLeftArrow = findViewById(R.id.imgLeftArrow);

        imgLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoBackToSignIn();
            }
        });
    }

    public void GoBackToSignIn(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}