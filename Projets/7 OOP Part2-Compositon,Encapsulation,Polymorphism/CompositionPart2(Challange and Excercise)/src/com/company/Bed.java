package com.company;

public class Bed {
    private String size;
    private String bedModel;

    public Bed(String size, String bedModel) {
        this.size = size;
        this.bedModel = bedModel;
    }
    //Methods
    public void make(){
        System.out.println("Bed -> Making");
    }


//Getters
    public String getSize() {
        return size;
    }

    public String getBedModel() {
        return bedModel;
    }
}
