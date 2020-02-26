package com.example.htg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;

import com.example.htg.adapter.PlacesAdapter;
import com.example.htg.samples.Place;

import java.util.ArrayList;
import java.util.List;

public class PlacesActivity extends AppCompatActivity {

    private List<Place> list =new ArrayList<>();
    private PlacesAdapter adapter;
    private  RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        Place place = new Place("Mad Max: Fury Road", "Action & Adventure", R.drawable.bg);
        list.add(place);
        Place place1 = new Place("Mad dax roy", "Action & haghajs", R.drawable.bg2);
        list.add(place1);

        recyclerView =  findViewById(R.id.recycler_view);
        adapter = new PlacesAdapter(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

//        prepareMovieData();
    }


      private void prepareMovieData() {
          Place place = new Place("Mad Max: Fury Road", "Action & Adventure", R.drawable.bg);
          list.add(place);
          Place place1 = new Place("Mad dax roy", "Action & haghajs", R.drawable.bg2);
          list.add(place1);
             adapter.notifyDataSetChanged();
       }
    }
