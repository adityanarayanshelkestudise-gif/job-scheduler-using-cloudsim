package org.cloudsim.scheduling;

public class TestMatricesOnly {
    public static void main(String[] args) {
        System.out.println("Testing GenerateMatrices class independently...");
        System.out.println("=========================================");
        
        // This will work because GenerateMatrices doesn't depend on CloudSim
        new GenerateMatrices();
        
        double[][] commMatrix = GenerateMatrices.getCommMatrix();
        double[][] execMatrix = GenerateMatrices.getExecMatrix();
        
        System.out.println("\nCommunication Matrix (first 5 tasks, all datacenters):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Task " + i + ": ");
            for (int j = 0; j < SimulationConstants.DATACENTER_COUNT; j++) {
                System.out.printf("%.2f ", commMatrix[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nExecution Matrix (first 5 tasks, all datacenters):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Task " + i + ": ");
            for (int j = 0; j < SimulationConstants.DATACENTER_COUNT; j++) {
                System.out.printf("%.2f ", execMatrix[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nSJF Scheduling Preview (first 5 tasks):");
        System.out.println("Task | Best DC | Total Time");
        System.out.println("-----|---------|----------");
        
        for (int i = 0; i < 5; i++) {
            double minTime = Double.MAX_VALUE;
            int bestDC = 0;
            
            for (int j = 0; j < SimulationConstants.DATACENTER_COUNT; j++) {
                double totalTime = commMatrix[i][j] + execMatrix[i][j];
                if (totalTime < minTime) {
                    minTime = totalTime;
                    bestDC = j;
                }
            }
            
            System.out.printf("  %d  |    %d    | %.2f\n", i, bestDC, minTime);
        }
        
        System.out.println("\nNote: Full simulation requires CloudSim library!");
    }
}
