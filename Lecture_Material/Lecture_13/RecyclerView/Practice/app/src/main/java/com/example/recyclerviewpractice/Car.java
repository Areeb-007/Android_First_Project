package com.example.recyclerviewpractice;

public class Car {

    public String name;
    public int chasyNumnber;
    public int model;
    public int modificationStage;
    public String color;

    public Car(String name, int chasyNumnber, int model, int modificationStage, String color) {
        this.name = name;
        this.chasyNumnber = chasyNumnber;
        this.model = model;
        this.modificationStage = modificationStage;
        this.color = color;
    }

    public Car(Car car)
    {
        this.name = car.name;
        this.chasyNumnber = car.chasyNumnber;
        this.model = car.model;
        this.modificationStage = car.modificationStage;
        this.color = car.color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChasyNumnber() {
        return chasyNumnber;
    }

    public void setChasyNumnber(int chasyNumnber) {
        this.chasyNumnber = chasyNumnber;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModificationStage() {
        return modificationStage;
    }

    public void setModificationStage(int modificationStage) {
        this.modificationStage = modificationStage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
