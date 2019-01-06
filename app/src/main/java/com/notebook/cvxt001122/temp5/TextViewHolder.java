package com.notebook.cvxt001122.temp5;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TextViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView title,more;
    ClickListener listener;
    public TextViewHolder(@NonNull View itemView,ClickListener listener) {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        more=itemView.findViewById(R.id.more);
        this.listener=listener;
        title.setOnClickListener(this);
        more.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        listener.itemClicked(view, more.getText().toString() );
    }
}
