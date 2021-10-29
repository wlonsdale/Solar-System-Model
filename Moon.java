/**
 * This class models a moon to be added to a SolarSystem instance
 */
public class Moon extends CelestialBody
{
    private double distance;
    private double angle;
    private double speed;
    private Planet planet;

    /**
     * Constructor. Assigns initial values to variables.
     * @param name the name of the moon
     * @param distance the distance of the moon from the centre of the planet it is orbiting
     * @param angle the angle of the moon
     * @param diameter the diameter of the moon
     * @param colour the colour of the planet (e.g. "YELLOW", "BLUE", etc)
     * @param speed the orbital speed of the moon
     * @param planet the planet this moon is orbiting
     * @param solarSystem the SolarSystem instance to which this moon will be added
     */
    public Moon(String name, double distance, double angle, double diameter, String colour, double speed, Planet planet, SolarSystem solarSystem)
    {
        super(name, diameter, colour, solarSystem);
        this.distance = distance;
        this.angle = angle;
        this.speed = speed;
        this.planet = planet;
    }

    /**
     * This method increments the angle by the value of speed and calls drawSolarObject
     */
    public void move()
    {
        if (angle > 360)
            angle = 0;
            
        angle += speed;
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, colour, planet.getDistance(), planet.getAngle());
    }
}