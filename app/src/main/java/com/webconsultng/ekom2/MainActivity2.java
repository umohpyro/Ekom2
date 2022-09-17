package com.webconsultng.ekom2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView itemClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        itemClicked =  findViewById(R.id.loadedItem);

        Intent intent = getIntent();

       int x =  intent.getIntExtra("clickedItem", 0);
       itemClicked.setText("Product "+(x+1)+" has been clicked");
    }
}