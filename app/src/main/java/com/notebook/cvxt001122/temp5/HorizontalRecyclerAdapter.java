package com.notebook.cvxt001122.temp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalRecyclerAdapter extends RecyclerView.Adapter {

    private ArrayList<ImageModel> data;
    LayoutInflater inflater;
    public HorizontalRecyclerAdapter(ArrayList<ImageModel> data){
        this.data=data;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.image_layout,parent,false );
        return new ImageCustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof  ImageCustomHolder){
            ((ImageCustomHolder) holder).image.setImageResource(data.get(position).getImageId());
            ((ImageCustomHolder) holder).name.setText(data.get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
