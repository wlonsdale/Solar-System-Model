public class Star extends CelestialBody
{
    public Star(double diameter, String colour, SolarSystem solarSystem)
    {
        super(diameter, colour, solarSystem);
    }

    public void move()
    {
        solarSystem.drawSolarObject(0, 0, diameter, colour);
    }
}