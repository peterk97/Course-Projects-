package com.company;
//This project is all about the Polymorphism !!
//classes are gonna be created within one java file and on different java files like before just to demonstrate better!

//Classes are created here //
        //Movie super class//
class Movie {
    private String name;

    //Constructor//
    public Movie(String name) {
        this.name = name;
    }
    //getter//
    public String getName() {
        return name;
    }

    //Methods//
    public String plot(){
     return "No Plot here!";
    }
}

        //Movies subclasses extends the "Movie" Superclass
    class Notes extends Movie{
        public Notes() {
            super("Notes");
        }

        @Override
        public String plot() {
            return "People love each other";
        }
    }

    class IndependenceDay extends Movie{
        public IndependenceDay() {
            super("IndependenceDay");
        }

        @Override
        public String plot() {
            return "Aliens try to take over planet Earth";
        }
    }

    class StarWars extends Movie{
        public StarWars() {
            super("Star Wars");
        }

        @Override
        public String plot() {
            return "Imperials try to take over the Universe";
        }
    }

    class Naruto extends Movie{
        public Naruto() {
            super("Naruto");
        }

        @Override
        public String plot() {
            return "Ninjas try to make to word better";
        }
    }

    class Forgetable extends Movie{
        public Forgetable() {
            super("Forgetable");
        }

        //No Plot here !
        //because this has no plot method overridden it is gonna go into a Movie super class and find the plot over there
        //and ude that plot which says "No plot here"! 
    }




//MAIN//

public class Main {

    public static void main(String[] args) {
        //For loop is going to call the randomMovie method for a specific time!
        //Using polymorphism to call the relevant plot method for that class!!
        for (int i = 1; i<11; i++){
            //crate a variable and assign itt to randomMovie();
            Movie movie = randomMovi();
            System.out.println("Movie #" + i +
                                " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n"); // "\n" means it is gonna put the printed thing into a new line!
        }

    }

    //Static method returns a random movie ! Using the Movie data type!
    public static Movie randomMovi(){
        int radomNumber = (int) (Math.random()*5)+1;//return a num in between 1-5 //cast it ti int because it returns a double
        System.out.println("Random number generated was: " + radomNumber);
        switch (radomNumber){
            case 1:
                return new Notes();

            case 2:
                return new IndependenceDay();  // we do not need brake here because the return is right at the first line and we returning a specificly generated number

            case 3:
                return new StarWars();

            case 4:
                return new Naruto();

            case 5:
                return new Forgetable();
        }
        return null;
    }
}


























