import java.util.ArrayList;

/**
 * This class acts as a controller for adding and removing planets.
 */
public class Controller implements SolarSystemController
{
    private SolarSystem solarSystem;
    private ArrayList<CelestialBody> celestialBodies = new ArrayList<CelestialBody>();

    /**
     * Constructor
     * @param s The solar system the celestial objects will be added to.
     */
    public Controller(SolarSystem s)
    {
        this.solarSystem = s;
    }

    /**
     * Adds a celestial body to the solar system.
     */
    public void add(String name, double distance, double angle, double diameter, double speed, String colour)
    {
        if (!nameExists(name))
            celestialBodies.add(new Planet(name, distance, angle, diameter, colour, speed, solarSystem));
        else
            System.out.println("A celestial body with that name already exists!");
    }

    /**
     * Adds a celestial body, that orbits an existing celestial body, to the solar system.
     */
    public void add(String name, double distance, double angle, double diameter, double speed, String colour, String parentName)
    {
        if (!nameExists(name))
            if (nameExists(parentName))
                celestialBodies.add(new Moon(name, distance, angle, diameter, colour, speed, (Planet) findCelestialBody(parentName), solarSystem));
            else
                System.out.println("The celestial body you want to orbit doesn't exist!");
        else
            System.out.println("A celestial body with that name already exists!");
    }

    /**
     * Removes a celestial body from the solar system.
     */
    public void remove(String name)
    {
        if (nameExists(name))
            celestialBodies.remove(findCelestialBody(name));
        else
            System.out.println("The celestial body you want to remove doesn't exist!");
    }

    /**
     * Searches for the celestial body by name.
     * @param name The name of the celestial body to be searched for.
     * @return The celstial body that was searched for.
     */
    public CelestialBody findCelestialBody(String name)
    {
        for (CelestialBody cb : celestialBodies)
            if (cb.getName().equals(name))
                return cb;
        
        return null;
    }

    /**
     * Calls the move method on all celestial bodies.
     */
    public void move()
    {
        for (CelestialBody cb : celestialBodies)
            cb.move();
    }

    /**
     * Checks if a celestial body exists with a certain name.
     * @param name The name to be searched for.
     * @return True is name was found. False if name was not found.
     */
    public boolean nameExists(String name)
    {
        for (CelestialBody cb : celestialBodies)
            if (cb.getName().equals(name))
                return true;

        return false;
    }
}