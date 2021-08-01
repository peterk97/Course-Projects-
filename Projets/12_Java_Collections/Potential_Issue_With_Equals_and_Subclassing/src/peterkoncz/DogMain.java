package peterkoncz;

/**
 * Main method for the Dog classes and for the demonstration what can be the issue comparing subClass
 *
 * It show that the great full of thought is needed to override equals() and hashCode
 *
 * Should you allow your classes to be subclassed ?
 * *if so how do you treat comparison between its subC and the baseC
 * * so if the subC would reasonably only add methods that do not alter the way that equality should work allow subClassing
 * but mark your equals() and hashCode methods as final !!
 *
 * * now if the subC is likely to be a different Obj then use the method to make comparison between the subC and its baseC
 * return false if needed
 *
 * * if nether of these really fit then prevent subClassing and use composition instead !
 */

public class DogMain {
    public static void main(String[] args) {


        //This case the 1. is true and the 2. is false because rover is an instance of rover2 but not other way around
        //equals() method must obey so it has to be equal on both sides of the coin
        //we cannot fix this the best way to fix this is to not override the equals() method in Labrador class
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));

    }
}
