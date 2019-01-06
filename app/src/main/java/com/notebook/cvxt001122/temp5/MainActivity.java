package com.notebook.cvxt001122.temp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private Toolbar toolbar;
    private List<Object> data;
    private ArrayList<ImageModel> reverseImageModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        recyclerView=findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        data=new ArrayList<>();
        ArrayList<ImageModel> imageModels=new ArrayList<>();
        reverseImageModels=new ArrayList<>();
        imageModels.add(new ImageModel(R.drawable.anshika1,"Rashmika" ));
        imageModels.add(new ImageModel(R.drawable.anshika2,"Rashmika" ));
        imageModels.add(new ImageModel(R.drawable.anshika3,"Rashmika" ));
        imageModels.add(new ImageModel(R.drawable.anupma,"Anupma" ));
        imageModels.add(new ImageModel(R.drawable.anupma1,"Anupma" ));
        imageModels.add(new ImageModel(R.drawable.anupma2,"Anupma" ));
        imageModels.add(new ImageModel(R.drawable.anupma3,"Anupma" ));

        reverseImageModels=reverseList(imageModels);

        data.add(new TitleModel("south actress", "more"));
        data.add(imageModels);

        data.add(new TitleModel("south Actress","more" ));
        data.add(reverseImageModels);

        data.add(new TitleModel("south actress", "more"));
        data.add(imageModels);

        data.add(new TitleModel("south actress", "more"));
        data.add(reverseImageModels);

        data.add(new TitleModel("south actress", "more"));
        data.add(imageModels);

        data.add(new TitleModel("south actress", "more"));
        data.add(reverseImageModels);

        data.add(new TitleModel("south actress", "more"));
        data.add(imageModels);

        data.add(new TitleModel("south actress", "more"));
        data.add(reverseImageModels);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        RecyclerAdapter adapter=new RecyclerAdapter(data,this);

        recyclerView.setAdapter(adapter);







    }

    private ArrayList<ImageModel> reverseList(ArrayList<ImageModel> imageModels){

        int k=0;
        for(int i=imageModels.size()-1;i>=0;i--){
            reverseImageModels.add(imageModels.get(i));
        }
        return reverseImageModels;
    }
}
