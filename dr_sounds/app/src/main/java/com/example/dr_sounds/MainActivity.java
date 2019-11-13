package com.example.dr_sounds;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void initlogin (View v){
        EditText username = (EditText) findViewById(R.id.Username);
        EditText password = (EditText) findViewById(R.id.Password);
        Button login = (Button) findViewById(R.id.button);
        TextView checker = (TextView) findViewById(R.id.checker);

        if(username.getText().toString() != "user" || password.getText().toString() != "pass"){
            checker.setText("Wrong Credentials, Try Again");
            checker.setVisibility(View.VISIBLE);
        }

    }
}
