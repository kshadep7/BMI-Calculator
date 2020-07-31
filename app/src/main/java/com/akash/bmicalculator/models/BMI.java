package com.akash.bmicalculator.models;


public class BMI {
    int bmiId = 0;
    int height = 0;
    int weight = 0;
    String date = "";

    public int getBmiId() {
        return bmiId;
    }

    public void setBmiId(int bmiId) {
        this.bmiId = bmiId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
