import java.util.ArrayList;

public class Controller implements SolarSystemController
{
    private SolarSystem solarSystem;
    private ArrayList celestialBodies = new ArrayList<>();

    public Controller(SolarSystem s)
    {
        this.solarSystem = s;
    }

    public void add(String name, double distance, double angle, double diameter, double speed, String colour)
    {
        celestialBodies.add(new Planet(name, distance, angle, diameter, colour, speed, solarSystem));
    }

    public void add(String name, double distance, double angle, double diameter, double speed, String colour, String parentName)
    {
        try
        {
            celestialBodies.add(new Moon(name, distance, angle, diameter, colour, speed, (Planet) findCelestialBody(parentName), solarSystem));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    public void remove(String name)
    {
        for (int i = 0; i < celestialBodies.size(); i++)
        {
            if (((CelestialBody) celestialBodies.get(i)).getName().equals(name))
                celestialBodies.remove(i);
        }
    }

    public CelestialBody findCelestialBody(String name)
    {
        for (int i = 0; i < celestialBodies.size(); i++)
        {
            if (((CelestialBody) celestialBodies.get(i)).getName().equals(name))
                return (CelestialBody) celestialBodies.get(i);
        }
        
        throw new IllegalArgumentException("The planet you want to orbit doesn't exist");
    }

    public void move()
    {
        for (int i = 0; i < celestialBodies.size(); i++)
        {
            if (celestialBodies.get(i) != null)
                ((CelestialBody) celestialBodies.get(i)).move();
        }
    }
}