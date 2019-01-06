package com.notebook.cvxt001122.temp5;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TextViewHolder extends RecyclerView.ViewHolder {
    TextView title,more;

    public TextViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        more=itemView.findViewById(R.id.more);

    }
}
