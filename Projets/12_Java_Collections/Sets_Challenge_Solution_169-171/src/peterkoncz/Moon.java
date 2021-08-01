package peterkoncz;

public class Moon extends HeavenlyBody {

    //using the super constructor but because we know this is a Moon
    //we are taking the parameter out and set the bodyType to Moon using the Enum
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
