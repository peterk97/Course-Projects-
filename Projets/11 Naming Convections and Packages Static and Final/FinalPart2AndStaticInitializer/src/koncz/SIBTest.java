package koncz;


/**
 * Static initialization block class
 * and it can be as many as you like
 * in this we have two and they called in the order they declared in the class
 * we put one before and after the constructor what is not a good practice
 * because people expect the constructor to be called before the second block  which is not the case!
 */

public class SIBTest {
    public static final String owner;

    static {
        owner = "peter";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
