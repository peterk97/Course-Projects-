package peterkoncz;

/**
 * This project is the second scope project almost the same as the one with some var name changes
 * and this will focus more in visibility
 */
public class Main {

    public static void main(String[] args) {


        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("varThree is not accessible here if it is private " + varThree);

//        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass(); // this si how to create an innerclass!!
//        innerClass.timesTwo();
    }
}
