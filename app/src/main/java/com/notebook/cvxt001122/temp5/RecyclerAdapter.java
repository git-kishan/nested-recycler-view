package com.notebook.cvxt001122.temp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter {

    Context context;
    List<Object> data;
    private final int VERTICAL=1;
    private final int HORIZONTAL=2;
    LayoutInflater inflater;
    public RecyclerAdapter (List<Object> data, Context context){
        this.data=data;
        this.context=context;

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(parent.getContext());
        View view;
        RecyclerView.ViewHolder viewHolder;
        if(viewType==VERTICAL)
        {
            view=inflater.inflate(R.layout.vertical_recycler_view,parent,false );
            viewHolder=new VerticalViewHolder(view);

        }
        else {
            view=inflater.inflate(R.layout.horizontal_recycler_view,parent,false );
            viewHolder=new HorizontalViewHolder(view);
        }
        return  viewHolder;



    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        if(holder.getItemViewType()==HORIZONTAL&& holder instanceof HorizontalViewHolder){
            HorizontalRecyclerAdapter adapter=new HorizontalRecyclerAdapter(
                    (ArrayList<ImageModel>) data.get(position));
            ((HorizontalViewHolder) holder).recyclerView.setLayoutManager(new LinearLayoutManager(
                    context,LinearLayoutManager.HORIZONTAL,false));
            ((HorizontalViewHolder) holder).recyclerView.setAdapter(adapter);
        }
        if(holder.getItemViewType()==VERTICAL && holder instanceof VerticalViewHolder){
            VerticalRecyclerAdapter adapter=new VerticalRecyclerAdapter(
                    (ArrayList<TitleModel>) data.get(position));
            ((VerticalViewHolder) holder).recyclerView.setLayoutManager(new LinearLayoutManager(
                    context));
            ((VerticalViewHolder) holder).recyclerView.setAdapter(adapter);


        }


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {

        if(data.get(position) instanceof TitleModel)
            return VERTICAL;
       else
            return HORIZONTAL;



    }
}
