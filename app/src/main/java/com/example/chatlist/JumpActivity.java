package com.example.chatlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JumpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);
        Intent intent  = getIntent();
        String itemid = intent.getStringExtra("jumpkey");
        TextView tV = findViewById(R.id.textView);
        tV.setText(itemid);
    }

}