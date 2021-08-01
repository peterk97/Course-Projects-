package peterkoncz;


import java.util.HashSet;
import java.util.Set;

public  abstract class HeavenlyBody {


    private final String name;
    private String bodyType;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, String bodyType) {
        this.name = name;
        this.bodyType = bodyType;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }


    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getName() {
        return this.name;
    }

    //we are creating a new HAshMap with our content to retrieve not directly! no access to our original HS
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    //have the option to add a moon, this is why we want to pass a parameter which is a heavenlyBody
    //and we will call it moon and we want to add it to the set
    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    //here we are going to override the equals method you can use short cut because intelliJ knows it can be handy so you can generate it
    //always use the @Override notation because it is very easy to overload the equals method instead of overriding ex(wrong parameter) and if you ude it if you
    //accidentally made a mistake it will be an error so you know if you do not use it is going to be overloaded and won't work!
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }
        //print is for debugging purposes
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        //here checking of passed obj isn't null or if they are from a same class so can compare
        //test for null is important because if we try to call the getClass method on null it will throw null pointer exception
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
         }

            //here we are checking if the names are equal to comparing names is the criteria
            //and using the string compare method to compare names against each other

            String objName = ((HeavenlyBody) obj).getName();
            return this.name.equals(objName);
        }

        @Override
        public int hashCode () {
            System.out.println("HashCode is being called!");
            return this.name.hashCode() + 57;
        }


    }
