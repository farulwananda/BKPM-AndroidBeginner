package com.farul.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;


import android.os.Bundle;

public class AdobeView extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.acrobat,R.drawable.aftereffects,R.drawable.audition,
            R.drawable.experience,R.drawable.illustrator,R.drawable.indesign,R.drawable.lightroom,R.drawable.photoshop};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adobe_view);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.software_adobe);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}