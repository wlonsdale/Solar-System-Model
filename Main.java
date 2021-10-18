public class Main
{
    public static void main(String[] args)
    {
        SolarSystem solSystem = new SolarSystem(1000, 1000);
        CelestialBody celestialBodies[] = new CelestialBody[11];

        celestialBodies[0] = new Planet(100, 90, 5, "GRAY", 4, solSystem);                                      // Mercury
        celestialBodies[1] = new Planet(150, 180, 10, "#A52A2A", 4, solSystem);                                 // Venus
        celestialBodies[2] = new Planet(200, 200, 10, "BLUE", 3, solSystem);                                    // Earth
        celestialBodies[3] = new Planet(250, 70, 7, "RED", 3, solSystem);                                       // Mars
        celestialBodies[4] = new Planet(400, 60, 50, "ORANGE", 2, solSystem);                                   // Jupiter
        celestialBodies[5] = new Planet(500, 140, 40, "YELLOW", 2, solSystem);                                  // Saturn
        celestialBodies[6] = new Planet(600, 80, 20, "CYAN", 1, solSystem);                                     // Uranus
        celestialBodies[7] = new Planet(650, 160, 20, "BLUE", 1, solSystem);                                    // Neptune
        celestialBodies[8] = new Planet(700, 300, 3, "WHITE", 1, solSystem);                                    // Pluto
        celestialBodies[9] = new Star(100, "YELLOW", solSystem);                                                // The Sun
        celestialBodies[10] = new Moon(15, 90, 2, "GRAY", 1, (Planet) celestialBodies[2], solSystem);           // Earth's Moon

        while (true)
        {
            for (int i = 0; i < celestialBodies.length; i++)
                celestialBodies[i].move();

            solSystem.finishedDrawing();
        }
    }    
}
