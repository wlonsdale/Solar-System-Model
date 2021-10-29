public class Comet extends CelestialBody
{
    private double maxDistance;
    private double minDistance;
    private double distance;
    private double angle;
    private double speed;

    public Comet(String name, double maxDistance, double minDistance, double angle, double diameter, String colour, double speed, SolarSystem solarSystem)
    {
        super(name, diameter, colour, solarSystem);
        this.maxDistance = maxDistance;
        this.minDistance = minDistance;
        this.distance = maxDistance;
        this.angle = angle;
        this.speed = speed;
    }

    public void move()
    {
        double x = (maxDistance - minDistance) / (180 / speed);

        if (angle > 360)
            angle = 0;

        if (angle >= 0 && angle <= 180)
        {
            distance -= x;
            angle += speed;
            solarSystem.drawSolarObject(distance, angle, diameter, colour);
        }

        else
        {
            distance += x;
            angle += speed;
            solarSystem.drawSolarObject(distance, angle, diameter, colour);
        }
    }
}