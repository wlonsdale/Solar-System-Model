public class Planet extends CelestialBody
{
    private double distance;
    private double angle;
    private double speed;

    public Planet(double distance, double angle, double diameter, String colour, double speed, SolarSystem solarSystem)
    {
        super(diameter, colour, solarSystem);
        this.distance = distance;
        this.angle = angle;
        this.speed = speed;
    }

    public void move()
    {
        angle += speed;
        solarSystem.drawSolarObject(distance, angle, diameter, colour);
    }

    public double getAngle()
    {
        return angle;
    }

    public double getDistance()
    {
        return distance;
    }
}