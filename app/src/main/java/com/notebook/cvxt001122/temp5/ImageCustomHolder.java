package com.notebook.cvxt001122.temp5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageCustomHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

     ImageView image;
     TextView name;
     ClickListener listener;

    public ImageCustomHolder(@NonNull View itemView,ClickListener listener) {
        super(itemView);
        image=itemView.findViewById(R.id.image);
        name=itemView.findViewById(R.id.name);
        this.listener=listener;
        image.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        listener.itemClicked(image, name.getText().toString(),getAdapterPosition() );
    }
}
