package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView;

public class xmlMainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_main3);
        Bundle bundle = getIntent().getExtras();
        final Items item = (Items) bundle.getSerializable("item");
        String selectedItemName = item.getItemName();
        int selectedItemImage= item.getItemImage();
        ImageView cofe = findViewById(R.id.imagecoffee);
        TextView textcofe = findViewById(R.id.coffeetext);
        cofe.setImageResource(selectedItemImage);
        textcofe.setText(selectedItemName);


    }
}