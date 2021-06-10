package com.example.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    ArrayList<Car> cars=new ArrayList<Car>();

    public ItemsAdapter(ArrayList<Car> carArrayList){
        cars=carArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.cars_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car=new Car(cars.get(position));
        holder.carName.setText(car.name);
        holder.carModel.setText(String.valueOf(car.model));
        holder.carColor.setText(car.color);
        holder.carStage.setText(String.valueOf(car.modificationStage) );
    }


    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView carName;
        TextView carModel;
        TextView carColor;
        TextView carStage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            carName= itemView.findViewById(R.id.name);
            carModel= itemView.findViewById(R.id.model);
            carColor= itemView.findViewById(R.id.color);
            carStage= itemView.findViewById(R.id.stage);
        }
    }
}
