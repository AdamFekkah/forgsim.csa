public class Main {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);

        // Test simulate() once
        System.out.println("Single simulation result: " + sim.simulate());

        // Test runSimulations
        System.out.println("Simulation success rate: " + sim.runSimulations(4));
    }
}
