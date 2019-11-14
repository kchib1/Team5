package com.example.dr_sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;
    TextView checker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.Password);
        login = (Button) findViewById(R.id.button);
        checker = (TextView) findViewById(R.id.checker);
    }
    public void initlogin(View v){
        if(username.getText().toString() != "user" || password.getText().toString() != "pass"){
            checker.setText("Wrong Credentials, Try Again");
            checker.setVisibility(View.VISIBLE);
        }
    }

}
