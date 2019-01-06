package com.notebook.cvxt001122.temp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private Toolbar toolbar;
    private List<Object> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        recyclerView=findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        data=new ArrayList<>();
        data.add(new TitleModel("south Actress","more" ));
        data.add(new ImageModel(R.drawable.anshika1,"Rashmika" ));
        data.add(new TitleModel("south actress", "more"));
        data.add(new ImageModel(R.drawable.anshika2,"Rashmika" ));
        data.add(new TitleModel("south actress", "more"));
        data.add(new ImageModel(R.drawable.anshika3,"Rashmika" ));
        data.add(new TitleModel("south actress", "more"));
        data.add(new ImageModel(R.drawable.anupma,"Anupma" ));
        data.add(new TitleModel("south actress", "more"));
        data.add(new ImageModel(R.drawable.anupma1,"Anupma" ));
        data.add(new TitleModel("south actress", "more"));
        data.add(new ImageModel(R.drawable.anupma2,"Anupma" ));
        data.add(new TitleModel("south actress", "more"));
        data.add(new ImageModel(R.drawable.anupma3,"Anupma" ));
        data.add(new TitleModel("south actress", "rashmika"));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerAdapter adapter=new RecyclerAdapter(data);

        recyclerView.setAdapter(adapter);







    }
}
