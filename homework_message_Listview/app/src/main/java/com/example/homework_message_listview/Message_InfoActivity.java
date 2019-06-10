package com.example.homework_message_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Message_InfoActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textmessage, time;
    String message, Time, name;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message__info);
        imageView = findViewById(R.id.user_Image);
        textmessage = findViewById(R.id.textMessage);
        time = findViewById(R.id.tv_time);

        message = getIntent().getStringExtra("TEXTMESSAGE");
        Time = getIntent().getStringExtra("TIME");
        image = getIntent().getIntExtra("IMAGE",0);
        name = getIntent().getStringExtra("NAME");

        imageView.setImageResource(image);
        textmessage.setText(message);
        time.setText(Time);
        getSupportActionBar().setTitle(name);

    }
}
