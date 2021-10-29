//import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        //Random random = new Random();

        SolarSystem solSystem = new SolarSystem(700, 700);
        SolarSystemGUI gui = new SolarSystemGUI();
        Controller controller = new Controller(solSystem);

        gui.addSolarSystemController(controller);

        while (true)
        {
            controller.move();
            solSystem.finishedDrawing();
        }

        /**CelestialBody celestialBodies[] = new CelestialBody[1000];
        celestialBodies[0] = new Star(100, "YELLOW", solSystem);                                                // The Sun
        celestialBodies[1] = new Planet(100, 90, 5, "GRAY", 4, solSystem);                                      // Mercury
        celestialBodies[2] = new Planet(150, 180, 10, "#A52A2A", 1.6, solSystem);                                 // Venus
        celestialBodies[3] = new Planet(200, 200, 10, "BLUE", 1, solSystem);                                  // Earth
        celestialBodies[4] = new Moon(15, 90, 2, "GRAY", 1, (Planet) celestialBodies[3], solSystem);                // Earth's Moon
        celestialBodies[5] = new Planet(250, 70, 7, "RED", 0.5, solSystem);                                       // Mars
        celestialBodies[6] = new Moon(15, 90, 2, "GRAY", 1, (Planet) celestialBodies[5], solSystem);                // Phobos
        celestialBodies[7] = new Moon(15, 110, 2, "GRAY", 2, (Planet) celestialBodies[5], solSystem);               // Deimos
        celestialBodies[8] = new Planet(500, 60, 50, "ORANGE", 0.5, solSystem);                                   // Jupiter
        celestialBodies[9] = new Moon(55, 90, 4, "YELLOW", 1, (Planet) celestialBodies[8], solSystem);              // Io
        celestialBodies[10] = new Moon(60, 130, 4, "GRAY", 3, (Planet) celestialBodies[8], solSystem);              // Europa
        celestialBodies[11] = new Moon(65, 20, 6, "WHITE", 2, (Planet) celestialBodies[8], solSystem);              // Ganymede
        celestialBodies[12] = new Moon(70, 260, 6, "GRAY", 4, (Planet) celestialBodies[8], solSystem);              // Callisto
        celestialBodies[13] = new Planet(600, 140, 40, "YELLOW", 0.3, solSystem);                                  // Saturn
        celestialBodies[14] = new Planet(700, 80, 20, "CYAN", 0.2, solSystem);                                     // Uranus
        celestialBodies[15] = new Moon(25, 90, 2, "GRAY", 1, (Planet) celestialBodies[14], solSystem);               // Miranda
        celestialBodies[16] = new Moon(40, 130, 3, "GRAY", 2, (Planet) celestialBodies[14], solSystem);              // Ariel
        celestialBodies[17] = new Moon(45, 20, 3, "GRAY", 2, (Planet) celestialBodies[14], solSystem);               // Umbriel
        celestialBodies[18] = new Moon(50, 260, 4, "GRAY", 3, (Planet) celestialBodies[14], solSystem);              // Titania
        celestialBodies[19] = new Moon(55, 300, 4, "GRAY", 3, (Planet) celestialBodies[14], solSystem);              // Oberon
        celestialBodies[20] = new Planet(800, 160, 20, "BLUE", 0.1, solSystem);                                    // Neptune
        celestialBodies[21] = new Moon(40, 320, 4, "GRAY", -2, (Planet) celestialBodies[20], solSystem);             // Triton
        //celestialBodies[22] = new Planet(700, 300, 3, "WHITE", 1, solSystem);                                    // Pluto

        // Asteroid Belt
        for (int i = 22; i < 900; i++)
            celestialBodies[i] = new Planet(random.nextDouble(30)+300, random.nextDouble(360), random.nextInt(4)+1, "GRAY", random.nextInt(4)+1, solSystem);

        // Rings of saturn
        for (int i = 900; i < 1000; i++)
            celestialBodies[i] = new Moon(random.nextDouble(10)+30, random.nextDouble(360), 1, "WHITE", 3, (Planet) celestialBodies[13], solSystem);

        while (true)
        {
            for (int i = 0; i < celestialBodies.length; i++)
                celestialBodies[i].move();

            solSystem.finishedDrawing();
        }*/
    }    
}
