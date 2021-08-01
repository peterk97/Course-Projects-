package peterkoncz;

public class Challenge {
      /*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

        You can include as many types as you want, but must support at
        least PLANET and MOON.

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.

        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.

        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.

        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).

        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.

        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).

        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.

        5. Two bodies with the same name but different designations can be added to the same set.

        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
*/

    /*
    ISSUE ::
    There is a an issue with the solar system map because we are defining it with the name (String) as a key and
    there is no wa to cater for the body type and because we are using a map we only got the key and the value

    SOLUTION:
    this is a common problem when attempting to store and retrieve more complex objects
    there are many solutions for this
    1, for example data bases allow records to be selected on several fields it is possible to make a primary key that consist with all the unique fields defined
    2, an other approach is to create unique serial numbers for each record such as (social sec num US, tax file num AU) so you cannot retrieve someones records
    unless you know the number.
    Like in universe all the object have a unique num to retrieve the info about it but the disadvantage is that you have to know the number to get the info!

      Here you may use a number instead of the name as a key or concatenated the name with the body type can work as well

    In this solution we are going to create a class and give the HB class a field of type key!
     because this key is going ot be closely tied to the HB class we are gonna make it a static inner class of the HB class

     */





}
