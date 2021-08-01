package com.company;

//This is an example why you should use encapsulation in a class and it is so important to not to access the fields directly!
// there are several reasons but the main ones are: to not allow a user to change these fields any time and so easily
// also if you access these in main and set theme up manually and after you change a name for fullName you have to change it in the main as well and it can be difficult if you have a big application!!
//you also cannot ass any validation for the fields !!!
public class Player {
    public String fullName; //if you change this !
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health<0){
            System.out.println("Your player knocked out!");
            //Reduce number of lives remaining for the player!
        }
    }

    public int healthRemaining (){
        return this.health;
    }

}
