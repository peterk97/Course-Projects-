package com.company;

import java.util.ArrayList;


//NON STATIC NESTED CLASS!!
public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    // private int gearNum = 0; avoid confusion rename this to something else
    private int currentGear = 0;
    private boolean clutchIsIn;


    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral =  new Gear(0,0.0); //we added a new gear anyway in the constructor for neutral by default so that is how we could access that
        this.gears.add(neutral);

        //this is automatically add gears to the gear box
        for (int i = 0; i<maxGears; i++){
            addGear(i,i*5.6);
        }
    }

    public void operatingClutch (boolean in){
        this.clutchIsIn = in;
    }

    //this method adds new gears to the gearbox and keep the gear class private
    public void addGear(int num, double ratio){
        if (num > 0 && num <=maxGears){
            this.gears.add(new Gear(num,ratio));
        }
    }
//this method operate the gear box change gears
    public void changeGear (int newGear){
        if (newGear >=0 && newGear <this.gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else {
            System.out.println("Grrrrrrrrr");
            this.currentGear = 0; //change was not successful
        }
    }

    public double wheelSpeed (int revs){
        if (clutchIsIn){
            System.out.println("Scram!!");
            return 0.0;
        }else {
            return revs * gears.get(currentGear).getRatio();
        }
    }



    //Inner Class
    //the idea of using an inner class is that gears aren't really useful by theme selves it is couple with a gearbox
    //and this males it useful
    //instances of the gear class have got access to all the methods and fields of the outer gearbox class even those mark as private
    //keep in mind use this. refers to the class what you are currently in -> using the same variable name can be confusing
       // -> and the reason is why is it confusing is that inside the gear both this.gearNum and gearNum refer the gearNum of the gear and (not the gearbox)
      //-> so if you want to refer to gearBox's gear number from an instance of the gear class, -> you must use: gearbox.this.gearNum !
    private class Gear { //make it private it is a good idea because you don't want anyone to interact the gear class just to the gearbox class
       private int gearNum;
       private double ratio;

        public Gear(int gearNum, double ratio) {
            this.gearNum = gearNum;
            this.ratio = ratio;
        }

        //getter


        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }



}
