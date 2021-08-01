package com.company;

public class Main {

    public static void main(String[] args) {

        GearBox mcLaren = new GearBox(6);
        // we are not exposing the gear class)                //important because gear is an inner class of gearbox we need to specify the Outer class
       // GearBox.Gear first = mcLaren.new Gear(1,12.33); THIS IS THE ONLY RIGHT WAY!!      //-->//Gearbox. and after the Gear so we must use this syntax including the (mcLaren.new)

       // GearBox.Gear second = new GearBox.Gear(2,2.33) this in a ERROR
       // GearBox.Gear third = new mcLaren.Gear(3,17.55); you also cannot do this!


        mcLaren.operatingClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operatingClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operatingClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operatingClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

    }
}
