package com.example.dr_sounds;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserSelection extends AppCompatActivity {
    TextView userName;
    TextView addUser;
    ImageButton userImage;
    ImageButton addUserImage;
    String displayName = "User 1";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selection);
        userName = (TextView) findViewById(R.id.user_Name);
        userName.setText(displayName);
        addUser = (TextView) findViewById(R.id.add_user);
        userImage = (ImageButton) findViewById(R.id.user_image1);
        addUserImage = (ImageButton) findViewById(R.id.add_user_image1);
    }
}
