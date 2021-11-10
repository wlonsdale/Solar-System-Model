/**
 * This is an abstract class designed to be extended by specific celestial body types (e.g. planets, moons, stars)
 */
public abstract class CelestialBody
{
    protected String name;
    protected double diameter;
    protected String colour;
    protected SolarSystem solarSystem;

    /**
     * Assigns values to some variables that all subclasses of CelestialBody will have
     * @param name the name of the celestial body
     * @param diameter the diameter of the celestial body
     * @param colour the colour of the celestial body (e.g. "YELLOW", "BLUE", etc)
     * @param solarSystem the SolarSystem instance to which this celestial body will be added
     */
    public CelestialBody(String name, double diameter, String colour, SolarSystem solarSystem)
    {
        this.name = name;
        this.diameter = diameter;
        this.colour = colour;
        this.solarSystem = solarSystem;
    }

    /**
     * Abstract method. Will be overwritten by subclasses
     */
    public abstract void move();

    /**
     * Gets the name of the celestial body
     * @return the name of the celestial body
     */
    public String getName()
    {
        return name;
    }
}