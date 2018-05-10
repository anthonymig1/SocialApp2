package com.anthonycode.socialapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.anthonycode.socialapp.view.ConteinerActivity;
import com.anthonycode.socialapp.view.CreateAccountActivity;

import okhttp3.HttpUrl;

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
    public void goWebPlatzigram(View view){
        Uri uri = Uri.parse("https://www.youtube.com");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }
}
