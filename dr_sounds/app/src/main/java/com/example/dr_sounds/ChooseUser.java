package com.example.dr_sounds;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseUser extends AppCompatActivity {
    TextView stuff;
    ImageButton doctorbutton;
    ImageButton patitentbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_login);

    }

    public void Doctor(View v) {
        Intent intent = new Intent(ChooseUser.this, MainActivity.class);
        startActivity(intent);
        Log.d("Checker", "this shit should work");

    }


}