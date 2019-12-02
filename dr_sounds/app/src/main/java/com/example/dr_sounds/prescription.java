package com.example.dr_sounds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class prescription extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prescription_page);

        submit = (Button) findViewById(R.id.submit1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent endScreen = new Intent(prescription.this, EndScreen.class);
                startActivity(endScreen);
            }
        });
    }

}
