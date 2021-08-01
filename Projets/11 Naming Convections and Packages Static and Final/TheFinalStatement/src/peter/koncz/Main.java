package peter.koncz;

public class Main {

    /**
     * This project deals with the final keyword and demonstrate it with a (database)
     * example that every created class instance has it's own id number
     * @param args
     */

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

       // one.instanceNumber  = 4;  // you cannot change it because it is final !

        System.out.println(Math.PI); //this is an instance PI !

       // Math m = new Math();  // you cannot instenciate because the constructor has been marked as private! prevent instances to being created!
                                // cannot get around and create subclass and use that because the class declared as final it prevents the class to being subclassed!



        //PASSWORD INSTANCE
        /*
          This is an example why you want to prevent one of the method to be overridden, not as ans example of how
          to encrypt storing in a database
         */
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523255);
        password.letMeIn(97773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);





    }
}
