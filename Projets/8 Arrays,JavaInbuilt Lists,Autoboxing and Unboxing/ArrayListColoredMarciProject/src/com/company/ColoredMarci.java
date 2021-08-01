package com.company;

import java.util.ArrayList;



public class ColoredMarci {

    private ArrayList<Marci> marciList;

    //Constructor
    public ColoredMarci() {
        this.marciList = new ArrayList<Marci>();
    }

    //add method
    public boolean addMarci (Marci marci){
        if(findMarci(marci.getMarciColor()) >= 0){
            return false;
        } else {
            marciList.add(marci);
            return true;
        }
    }

    //remove method
    public boolean removeMarci (String color){
        if (findMarci(color)>=0){
            marciList.remove(findMarci(color));
            return true;
        }else {
           // System.out.println("Marci cannot find");
            return false;
        }
    }

    //find method
    private int findMarci(Marci marci){
        return marciList.indexOf(marci);
    }

    //find based on the name!
    private int findMarci(String color){
        int size = this.marciList.size();
        for (int i = 0; i<size; i++){
            if (marciList.get(i).getMarciColor().equals(color)){
                return i;
            }
        }
        return -1;
    }

    //find based on name and return object!
    public Marci findMarcell(String color){
        int position = findMarci(color);
        int size = this.marciList.size();
        for (int i = 0; i<size; i++){
            if (marciList.get(i).getMarciColor().equals(color)){
                System.out.println("Marcell found!");
                System.out.println("Color: " + marciList.get(i).getMarciColor());
                System.out.println("ID: " + marciList.get(i).getMarciId());
                return marciList.get(position);

            }
        }
        return null;
    }




    //print method
    public void printMarci (){
        int size = this.marciList.size();
        for (int i = 0; i<size;i++){
            System.out.println("Color :" + marciList.get(i).getMarciColor() + " Marci" +
                                 "\n Id: " + marciList.get(i).getMarciId());
        }
    }

    //print name and id based on a marci
    public void printMarci(Marci marci){
        System.out.println("Color :" + marci.getMarciColor() + " Marci" +
                "\n Id: " + marci.getMarciId());
    }

    public boolean modify (Marci oldMarci, Marci newMarci){
       int position = findMarci(oldMarci);
       if (position < 0){
           return false;
       }else if(findMarci(newMarci.getMarciColor()) != -1) {
           System.out.println("Marcell is already exist!");
           return false;
        }else{
           this.marciList.set(position,newMarci);
           System.out.println(oldMarci.getMarciColor() + ", was replaced with " + newMarci.getMarciColor());
           return true;
       }
    }

}












