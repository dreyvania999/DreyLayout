package com.example.dreylayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class RegistrationActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        checkBox = findViewById(R.id.checkBox);
    }

    public void onLogIn(View view) {
        Intent logIntent = new Intent(this, LogInActivity.class);
        startActivity(logIntent);
    }

    public void onRegistration(View v) {
        Intent intent = new Intent(this, CongratsActivity.class);
        startActivity(intent);
    }
}