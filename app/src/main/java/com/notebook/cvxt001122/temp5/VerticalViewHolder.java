package com.notebook.cvxt001122.temp5;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VerticalViewHolder extends RecyclerView.ViewHolder {
    RecyclerView recyclerView;
    public VerticalViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView=itemView.findViewById(R.id.recycler_view);
    }
}
