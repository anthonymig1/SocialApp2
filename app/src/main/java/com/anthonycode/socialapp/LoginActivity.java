package com.anthonycode.socialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.anthonycode.socialapp.view.ConteinerActivity;
import com.anthonycode.socialapp.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount (View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);


    }
    public void goLoginAccount(View view){
        Intent intent = new Intent(this, ConteinerActivity.class);
        startActivity(intent);

    }
}
