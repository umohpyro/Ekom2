package com.webconsultng.ekom2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    LinearLayoutManager linearlayoutmanager;
    ArrayList<Model> modell;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initViews();
    }

    private void initViews() {
       rv = findViewById(R.id.mainRecycler);
       linearlayoutmanager = new LinearLayoutManager(this);
        linearlayoutmanager.setOrientation(RecyclerView.VERTICAL);
        rv.setLayoutManager(linearlayoutmanager);
        adapter = new RecyclerAdapter(modell, this);
        rv.setAdapter(adapter);
         adapter.notifyDataSetChanged();

    }
    private void initData() {
        modell = new ArrayList<>();
       for (int i = 0; i<17; i++){
            modell.add(new Model(R.mipmap.ic_channel, "Message for this user", "last message", i+": 00am" ));
        }
    }
}