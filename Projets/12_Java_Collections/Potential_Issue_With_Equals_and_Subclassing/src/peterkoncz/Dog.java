package peterkoncz;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //to make sure this method cannot be overridden in subclasses mark it as final !!
    @Override
    public final boolean equals(Object obj) {
        if(this == obj){ // is it is a same obj in memory return true
            return true;
        }
        if (obj instanceof Dog){  //if it is Dog class
            String objName = ((Dog) obj).getName(); //casting the obj to a Dog
            return this.name.equals(objName);//then we are calling the String equals() method
        }
            return false;
    }
}
