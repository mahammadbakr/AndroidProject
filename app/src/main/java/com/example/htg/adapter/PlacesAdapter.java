package com.example.htg.adapter;

import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.htg.R;
import com.example.htg.samples.Place;

import java.util.List;

public class PlacesAdapter extends  RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {

    private List<Place> list;

    public PlacesAdapter(List<Place> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.places_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Place place = list.get(position);
        holder.namePlace.setText(place.getNamePlace());
        holder.descriptionPlace.setText(place.getDescriptionPlace());
        holder.imgPlace.setImageResource(place.getImgPlace());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView namePlace, descriptionPlace;
        public ImageView imgPlace;

        public MyViewHolder(View view) {
            super(view);
            namePlace = (TextView) view.findViewById(R.id.namePlace);
            descriptionPlace = (TextView) view.findViewById(R.id.descriptionPlace);
            imgPlace = (ImageView) view.findViewById(R.id.imgPlace);
        }
    }


}
