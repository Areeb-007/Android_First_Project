package com.example.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Car> cars= new ArrayList<Car>();
        cars.add(new Car("Honda Civic",123456,2015, 2, "Black"));
        cars.add(new Car("Honda City",123656,2018, 1, "Red"));
        cars.add(new Car("Honda Fit",154556,2019, 4, "White"));
        cars.add(new Car("Toyota 1.8",154546,1999, 3, "Black"));
        cars.add(new Car("Toyota 1.6",789798,2020, 1, "Purple"));
        cars.add(new Car("Toyota 1.3",771852,2015, 5, "Carbon Fiber"));


        recyclerView= findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(new ItemsAdapter(cars));

    }
}