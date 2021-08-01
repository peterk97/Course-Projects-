package peterkoncz;

public class DwarfPlanet extends HeavenlyBody{

    //using the super constructor but because we know this is a DwarfPlanet
    //we are taking the parameter out and set the bodyType to DwarfPlanet using the Enum
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
