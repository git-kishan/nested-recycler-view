package com.notebook.cvxt001122.temp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VerticalRecyclerAdapter extends RecyclerView.Adapter {
    private LayoutInflater inflater;
    private TitleModel data;
    public VerticalRecyclerAdapter(TitleModel data){
        this.data=data;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.title_layout,parent,false );
        return new TextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof TextViewHolder){
            ((TextViewHolder) holder).title.setText(data.getTitle());
            ((TextViewHolder) holder).more.setText(data.getMore());
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
