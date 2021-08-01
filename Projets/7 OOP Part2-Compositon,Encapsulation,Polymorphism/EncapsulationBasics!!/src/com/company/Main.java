package com.company;

public class Main {

    public static void main(String[] args) {

// encapsuled class !
        //i could initalzed all the prameters and validate th health!!
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Peter", 200,"War axe");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());



	// Example for public fields in a Player class
        
//        Player player  = new Player();
//        player.name = "Marcell"; it is gonna be an issue here as well because you have to change all the same variables as well!
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; //example for easily accessable from out the class!!
//        player.loseHealth(damage);
//        System.out.println("Remaining health is = " + player.healthRemaining());
    }
}
