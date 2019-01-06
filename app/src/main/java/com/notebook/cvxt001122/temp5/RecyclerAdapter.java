package com.notebook.cvxt001122.temp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter {

    List<Object> data;
    private int imageModel=1;
    private int titleModel=2;
    LayoutInflater inflater;
    public RecyclerAdapter (List<Object> data){
        this.data=data;

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(parent.getContext());
        if(viewType==imageModel){
             View view=inflater.inflate(R.layout.image_layout,parent,false );
             return new ImageCustomHolder(view);
        }
        else  if(viewType==titleModel){
            View view=inflater.inflate(R.layout.title_layout,parent,false );
            return new TextViewHolder(view);
        }
        return  null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof TextViewHolder){
            TitleModel object= (TitleModel) data.get(position);
            ((TextViewHolder) holder).title.setText(object.getTitle());
            ((TextViewHolder) holder).more.setText(object.getMore());

        }
        else if(holder instanceof  ImageCustomHolder){
            ImageModel object=(ImageModel)data.get(position);
            ((ImageCustomHolder) holder).image.setImageResource(object.getImageId());
            ((ImageCustomHolder) holder).name.setText(object.getName());
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {


        if(data.get(position) instanceof ImageModel){
            return imageModel;
        }
        else if(data.get(position) instanceof TitleModel){
            return titleModel;
        }
        return -1;

    }
}
