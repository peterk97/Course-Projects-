package com.peterkoncz;

public class Bed {
    //Variables
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    //Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    //Methods/Getters
    public void make(){
        System.out.println(style + "(bed): Has been made!");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
