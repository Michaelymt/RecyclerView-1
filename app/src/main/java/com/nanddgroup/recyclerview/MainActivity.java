package com.nanddgroup.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final static int COUNT = 10000;
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new Adapter(getApplicationContext(), getData());
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    public static List<Information> getData(){
        List<Information> data = new ArrayList<>();
        for (int i = 0; i < COUNT; i++){
            data.add(i, new Information("email_" + "_" + i + "@text.com", "Name_" + "_" + i, "Surname_" + "_" + i,
                    "Title_" + i, "" + i + "/" + "" + i + "/" + "" + i));
        }
        return data;
    }
}
