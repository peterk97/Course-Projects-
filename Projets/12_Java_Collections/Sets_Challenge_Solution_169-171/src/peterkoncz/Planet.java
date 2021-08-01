package peterkoncz;

public class Planet extends HeavenlyBody{

    //using the super constructor but because we know this is a planet
    //we are taking the parameter out and set the bodyType to planet using the Enum
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    //override the addSatellite
    //because we know for the planet satellites can only be Moons
    //so we have to restrict it only moons can be added
    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon); //calling the super to add satellite
        }else {
            return false;
        }
    }
}
