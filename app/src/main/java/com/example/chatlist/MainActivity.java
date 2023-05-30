package com.example.chatlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String JUMP_KEY = "csu.se.jumper";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = (RecyclerView) this.findViewById(R.id.recycler_view);

        ArrayList<ItemModel> itemList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemList.add(new ItemModel(i + 1));
        }

        RecyclerViewAdapter RVA = new RecyclerViewAdapter(MainActivity.this, itemList);

        list.setAdapter(RVA);
        list.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
/*
    public void Jump(View Button) {
        android.widget.Button btn = findViewById(R.id.itemid);
        String itemid = btn.getText().toString();
        Intent intent = new Intent(this, JumpActivity.class);
        intent.putExtra(JUMP_KEY, itemid);
        startActivity(intent);
    }

 */
}