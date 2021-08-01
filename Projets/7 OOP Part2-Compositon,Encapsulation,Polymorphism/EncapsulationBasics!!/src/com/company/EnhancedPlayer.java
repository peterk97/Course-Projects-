package com.company;



//this is how you use proper encapsulation in your class to protect your field from external changes int the basics!
//you can also use validations in your constructor or anywhere !!
//usually you want to ude this solution !!
//you also can change the name of any fields and you can change those names with intelliJ function (refactore -> rename )

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100; // after i changed the health to hitPoints nothing is changed in the output and i did not rename the getter and and
    private String weapon;      //constructor argument because this way i can even hide the real field name from the user to  use different names!

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100){  //implement validation !!
            this.hitPoints = health;
    }
        this.weapon = weapon;
    }

    public int getHealth() {
        return hitPoints;
    }
}
