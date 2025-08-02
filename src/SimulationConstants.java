package org.cloudsim.scheduling;

/**
 * Configuration constants for the CloudSim scheduling algorithm implementation.
 * 
 * <p>This utility class contains all the configuration parameters used throughout
 * the scheduling algorithm simulation. It follows the utility class pattern with
 * private constructor to prevent instantiation.</p>
 * 
 * @author CloudSim Scheduling Algorithm
 * @version 1.0
 * @since 2025
 */
public final class SimulationConstants {
    
    // Simulation Configuration
    /**
     * The number of cloudlets (tasks) to be executed in the simulation.
     * Default value represents a moderate workload for testing purposes.
     */
    public static final int CLOUDLET_COUNT = 30;
    
    /**
     * The number of datacenters available in the cloud infrastructure.
     * Multiple datacenters allow for distributed scheduling scenarios.
     */
    public static final int DATACENTER_COUNT = 5;
    
    // Algorithm Configuration
    /**
     * The population size for genetic algorithm or particle swarm optimization.
     * This determines the number of candidate solutions maintained during optimization.
     */
    public static final int OPTIMIZATION_POPULATION_SIZE = 25;
    
    /**
     * Private constructor to prevent instantiation of this utility class.
     * 
     * @throws UnsupportedOperationException if instantiation is attempted
     */
    private SimulationConstants() {
        throw new UnsupportedOperationException("Utility class - cannot be instantiated");
    }
}
