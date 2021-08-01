package com.company;

import java.util.ArrayList;

/**
 * This is a base team class and we can add players and also track the
 * wins and losses ect.
 */
//change the class declaration to a <T> which means it is a Type parameter
    //to get rid of the cast bellow at the getName we can use something else  <T extends Player>
    //T is a bounded type parameter
    // so if we  would use an other type of player it would not work
    //implements an Interface and using the diamond again because we want to make sure we are still using the same
     //generics like that   we have to implement a compareTo to fulfil this interface
    //because we only want to compare to teams in the same type that is why we are using the <Team<T>>
    //we created the ability to have generic types, such as team football player -> specifying the generic type as a parameter
     // to the generic interface comparable
       //-> if it is would be just <Team> we would not have the ability to compare the same teams as football vs football ect

public class Team<T extends  Player>  implements Comparable<Team<T>>{

    private String name;
    int played;
    int won;
    int lost;
    int tied;

//init the ArrayList
    private ArrayList<T> members = new ArrayList<>();//<T>
//const.
    public Team(String name){
        this.name = name;
    }
 //getter
    public String getName(){
        return this.name;
    }

    public int numPlayers(){
        return this.members.size();
    }

//add method
    //the add method accepting Player which enable us to add any kind of player that extends this class!
    public boolean addPlayer (T player){//here also type parameter
        if (members.contains(player)){
            System.out.println(((Player) player).getName() + "is already on this team!"); // we have to cast  here because Java does,t know if the passed obj has a getName method
            return false;                                                                  //with the <T> we need the cast but with bounded type <T extends Player> we don't need it
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked fot team " + this.name); //because we are using the bounded type we do not need the cast anymore
            return true;
        }
    }

//this method is determine the match results
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){ //the <T> is casting that just appropriate teams can play against each other

        String message;

        if (ourScore > theirScore){
            won++;
            message = " beat ";
        }else if (ourScore == theirScore){
            message = " drew with ";
            tied++;
        }else {
            message = " lost to ";
            lost++;
        }

        played++;
        //we doing this to update the opponent score and we passing null this time so it
        //does not get executed again
        // this way we saving our results for team but we also saving the results in the opponent's team as well
        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

//ranking method
      public int ranking(){
        return (won * 2) + tied;
      }

//compareTo method
    //this is takes an object and returns a -number if this is less than the object
    //0 if they are equal //and the positive if this is greater than the object
 //we are writing our own compareTo because it is not a String

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1; //if the ranking for this is higher then what we passed in this method
        }else if (this.ranking() < team.ranking()){
            return 1; //the current object hasn't got more points essentially
        }else{
            return 0; // ranking is a same
        }
    }
}


























