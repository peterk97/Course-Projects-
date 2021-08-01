package com.company;

public class Desk {
    private int drowes;
    private int doors;
    private String deskModel;



    public Desk(int drowes, int doors, String deskModel) {
        this.drowes = drowes;
        this.doors = doors;
        this.deskModel = deskModel;
    }

    public int getDrowes() {
        return drowes;
    }

    public int getDoors() {
        return doors;
    }

    public String getDeskModel() {
        return deskModel;
    }

}
