package com.notebook.cvxt001122.temp5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageCustomHolder extends RecyclerView.ViewHolder {

     ImageView image;
     TextView name;


    public ImageCustomHolder(@NonNull View itemView) {
        super(itemView);
        image=itemView.findViewById(R.id.image);
        name=itemView.findViewById(R.id.name);
    }
}
