package peterkoncz;

public class Labrador extends Dog {

    public Labrador(String name) { //calling Dog super constructor
        super(name);
    }

 //Because this is causing the issue we should not override this in this class

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){ // is it is a same obj in memory return true
//            return true;
//        }
//        if (obj instanceof Labrador){  //changed it to Labrador
//            String objName = ((Labrador) obj).getName(); //so it is testing for this class not for the super class
//            return this.getName().equals(objName);//getName() instead of name
//        }
//        return false;
//    }


}
