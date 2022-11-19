package com.example.dreylayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class LogInActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        checkBox = findViewById(R.id.checkBox);
    }

    public void onReg(View view) {
        Intent regIntent = new Intent(this,RegistrationActivity.class);
        startActivity(regIntent);
    }
}