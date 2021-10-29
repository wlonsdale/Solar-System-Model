/**
 * This class models a star to be added to a SolarSystem instance
 */
public class Star extends CelestialBody
{
    /**
     * Assigns values to some variables that all subclasses of CelestialBody will have
     * @param name the name of the star
     * @param diameter the diameter of the star
     * @param colour the colour of the star (e.g. "YELLOW", "BLUE", etc)
     * @param solarSystem the SolarSystem instance to which this star will be added
     */
    public Star(String name, double diameter, String colour, SolarSystem solarSystem)
    {
        super(name, diameter, colour, solarSystem);
    }

    /**
     * Calls drawSolarObject with the specification of this star
     */
    public void move()
    {
        solarSystem.drawSolarObject(0, 0, diameter, colour);
    }
}