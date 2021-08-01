package koncz;

public class Main {

    /**
     * This project is the second part of the final project
     * this is final and static initializer
     *So the purpose of this project is to show how to prevent a class to be subclassed
     * @param args
     */

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI); //this is an instance PI !
//       // Math m = new Math();  // you cannot instenciate because the constructor has been marked as private! prevent instances to being created!
//                                // cannot get around and create subclass and use that because the class declared as final it prevents the class to being subclassed!
//
//
//        //PASSWORD INSTANCE
//        /*
//          extended the password class so we could override the save password method so now we can see the decrypted original password and
//          this changed to whole security of the whole program
//          and this si when final can be useful
//         */
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523255);
//        password.letMeIn(97773);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);

//SIB TEST

        System.out.println("Main method called first");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

        //the interesting thing is both the initialization block was call before the constructor!


    }
}
