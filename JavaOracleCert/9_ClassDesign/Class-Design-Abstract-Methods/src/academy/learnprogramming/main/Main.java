package academy.learnprogramming.main;

import academy.learnprogramming.Animal;
import academy.learnprogramming.Dog;
import academy.learnprogramming.Husky;

/**
 * @author goran on 14/07/2017.
 */
public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        husky.setAge(6);
//        husky.printName();
        husky.printDetails();
        System.out.println("weight= " + husky.getWeight());

//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetails();

        husky.eat();
        System.out.println("avg= " + husky.getAverageWeight());


    }
}
