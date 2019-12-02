package com.example.dr_sounds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AudioSearch extends AppCompatActivity {
    Button searchpatient;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_search_patient);
        searchpatient = (Button) findViewById(R.id.searchpatientaudio);

    }

    public void nextpg(View v){
        Intent intent = new Intent(AudioSearch.this, prescription.class);
        startActivity(intent);
    }



}
