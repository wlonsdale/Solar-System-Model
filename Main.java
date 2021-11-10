import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();

        SolarSystem solSystem = new SolarSystem(1000, 1000);
        SolarSystemGUI gui = new SolarSystemGUI();
        Controller controller = new Controller(solSystem);

        gui.addSolarSystemController(controller);
    /*
        CelestialBody celestialBodies[] = new CelestialBody[1000];
        celestialBodies[0] = new Star("sun", 100, "YELLOW", solSystem);
        celestialBodies[1] = new Planet("mercury", 100, 90, 5, "GRAY", 4, solSystem);
        celestialBodies[2] = new Planet("venus", 150, 180, 10, "#A52A2A", 1.6, solSystem);
        celestialBodies[3] = new Planet("earth", 200, 200, 10, "BLUE", 1, solSystem);
        celestialBodies[4] = new Moon("moon", 15, 90, 2, "GRAY", 1, (Planet) celestialBodies[3], solSystem);
        celestialBodies[5] = new Planet("mars", 250, 70, 7, "RED", 0.5, solSystem);
        celestialBodies[6] = new Moon("phobos", 15, 90, 2, "GRAY", 1, (Planet) celestialBodies[5], solSystem);
        celestialBodies[7] = new Moon("deimos", 15, 110, 2, "GRAY", 2, (Planet) celestialBodies[5], solSystem);
        celestialBodies[8] = new Planet("jupiter", 500, 60, 50, "ORANGE", 0.5, solSystem);
        celestialBodies[9] = new Moon("io", 55, 90, 4, "YELLOW", 1, (Planet) celestialBodies[8], solSystem);
        celestialBodies[10] = new Moon("europa", 60, 130, 4, "GRAY", 3, (Planet) celestialBodies[8], solSystem);
        celestialBodies[11] = new Moon("ganymede", 65, 20, 6, "WHITE", 2, (Planet) celestialBodies[8], solSystem);
        celestialBodies[12] = new Moon("callisto", 70, 260, 6, "GRAY", 4, (Planet) celestialBodies[8], solSystem);
        celestialBodies[13] = new Planet("saturn", 600, 140, 40, "YELLOW", 0.3, solSystem);
        celestialBodies[14] = new Planet("uranus", 700, 80, 20, "CYAN", 0.2, solSystem);
        celestialBodies[15] = new Moon("miranda", 25, 90, 2, "GRAY", 1, (Planet) celestialBodies[14], solSystem);
        celestialBodies[16] = new Moon("ariel", 40, 130, 3, "GRAY", 2, (Planet) celestialBodies[14], solSystem);
        celestialBodies[17] = new Moon("umbriel", 45, 20, 3, "GRAY", 2, (Planet) celestialBodies[14], solSystem);
        celestialBodies[18] = new Moon("titania", 50, 260, 4, "GRAY", 3, (Planet) celestialBodies[14], solSystem);
        celestialBodies[19] = new Moon("oberon", 55, 300, 4, "GRAY", 3, (Planet) celestialBodies[14], solSystem);
        celestialBodies[20] = new Planet("neptune", 800, 160, 20, "BLUE", 0.1, solSystem);
        celestialBodies[21] = new Moon("triton", 40, 320, 4, "GRAY", -2, (Planet) celestialBodies[20], solSystem);

        // Asteroid Belt
        for (int i = 22; i < 900; i++)
            celestialBodies[i] = new Planet("asteroid" + i, random.nextDouble(30)+300, random.nextDouble(360), random.nextInt(4)+1, "GRAY", random.nextInt(4)+1, solSystem);

        // Rings of saturn
        for (int i = 900; i < 1000; i++)
            celestialBodies[i] = new Moon("ringObject" + i, random.nextDouble(10)+30, random.nextDouble(360), 1, "WHITE", 3, (Planet) celestialBodies[13], solSystem);
    */
        while (true)
        {
            /*for (int i = 0; i < celestialBodies.length; i++)
                celestialBodies[i].move();*/

            controller.move();
            solSystem.finishedDrawing();
        }
    }    
}
