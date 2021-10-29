/**
 * This class models a planet to be added to a SolarSystem instance
*/
public class Planet extends CelestialBody
{
    private double distance;
    private double angle;
    private double speed;

    /**
     * Constructor. Assigns initial values to variables.
     * @param name the name of the planet
     * @param distance the distance of the planet from the centre of the solar system
     * @param angle the angle of the planet
     * @param diameter the diameter of the planet
     * @param colour the colour of the planet (e.g. "YELLOW", "BLUE", etc)
     * @param speed the orbital speed of the planet
     * @param solarSystem the SolarSystem instance to which this planet will be added
     */
    public Planet(String name, double distance, double angle, double diameter, String colour, double speed, SolarSystem solarSystem)
    {
        super(name, diameter, colour, solarSystem);
        this.distance = distance;
        this.angle = angle;
        this.speed = speed;
    }

    /**
     * This method increments the angle by the value of speed and calls drawSolarObject
     */
    public void move()
    {
        if (angle > 360)
            angle = 0;

        angle += speed;
        solarSystem.drawSolarObject(distance, angle, diameter, colour);
    }

    /**
     * Gets the angle of this planet
     * @return the angle of this planet
     */
    public double getAngle()
    {
        return angle;
    }

    /**
     * Gets the distance of the planet from the centre of the solar system
     * @return the distance of the planet from the centre of the solar system
     */
    public double getDistance()
    {
        return distance;
    }
}