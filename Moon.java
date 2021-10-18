public class Moon extends CelestialBody
{
    private double distance;
    private double angle;
    private double speed;
    private Planet planet;

    public Moon(double distance, double angle, double diameter, String colour, double speed, Planet planet, SolarSystem solarSystem)
    {
        super(diameter, colour, solarSystem);
        this.distance = distance;
        this.angle = angle;
        this.speed = speed;
        this.planet = planet;
    }

    public void move()
    {
        if (angle > 360)
            angle = 0;
            
        angle += speed;
        solarSystem.drawSolarObjectAbout(distance, angle, diameter, colour, planet.getDistance(), planet.getAngle());
    }
}