package com.example.dr_sounds;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class doctorpage extends AppCompatActivity {
    Button sndbttn;
    Button idbutton;
    EditText patient_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_dashboard);
        sndbttn = (Button) findViewById(R.id.sndbutton);
        idbutton = (Button) findViewById(R.id.idbutton);
        patient_id = (EditText) findViewById(R.id.patient_id);

    }
    public void audiopage(View v){
        Intent intent = new Intent(doctorpage.this, AudioSearch.class);
        startActivity(intent);
    }

    public void prescription1(View v){
        Intent intent = new Intent(doctorpage.this, prescription.class);
        startActivity(intent);
    }
}
