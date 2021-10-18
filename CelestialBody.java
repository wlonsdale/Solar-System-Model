public class CelestialBody
{
    protected double diameter;
    protected String colour;
    protected SolarSystem solarSystem;

    public CelestialBody(double diameter, String colour, SolarSystem solarSystem)
    {
        this.diameter = diameter;
        this.colour = colour;
        this.solarSystem = solarSystem;
    }

    public void move()
    {
        
    }
}