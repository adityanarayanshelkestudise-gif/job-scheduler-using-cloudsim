public class SimpleTest {
    public static void main(String[] args) {
        System.out.println("🎯 CloudSim SJF Scheduler - Matrix Generation Demo");
        System.out.println("================================================");
        
        System.out.println("\n✅ JDK 21 is working!");
        System.out.println("✅ Java compilation successful!");
        
        System.out.println("\n📊 Simulating matrix generation (CloudSim not required):");
        
        // Simulate matrix generation
        double[][] commMatrix = new double[5][3]; // 5 tasks, 3 datacenters
        double[][] execMatrix = new double[5][3];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                commMatrix[i][j] = Math.random() * 600 + 20;
                execMatrix[i][j] = Math.random() * 500 + 10;
            }
        }
        
        System.out.println("\n📈 Communication Matrix (ms):");
        System.out.println("Task\\DC    DC0      DC1      DC2");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Task%d   %.1f   %.1f   %.1f\n", 
                i, commMatrix[i][0], commMatrix[i][1], commMatrix[i][2]);
        }
        
        System.out.println("\n⚡ Execution Matrix (ms):");
        System.out.println("Task\\DC    DC0      DC1      DC2");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Task%d   %.1f   %.1f   %.1f\n", 
                i, execMatrix[i][0], execMatrix[i][1], execMatrix[i][2]);
        }
        
        System.out.println("\n🎯 SJF Scheduling Preview:");
        System.out.println("Task | Best DC | Total Time (ms)");
        System.out.println("-----|---------|---------------");
        
        for (int i = 0; i < 5; i++) {
            double minTime = Double.MAX_VALUE;
            int bestDC = 0;
            
            for (int j = 0; j < 3; j++) {
                double totalTime = commMatrix[i][j] + execMatrix[i][j];
                if (totalTime < minTime) {
                    minTime = totalTime;
                    bestDC = j;
                }
            }
            
            System.out.printf("  %d  |    %d    |     %.1f\n", i, bestDC, minTime);
        }
        
        System.out.println("\n🚀 Status Summary:");
        System.out.println("✅ Java environment: Ready");
        System.out.println("✅ Code compilation: Working");
        System.out.println("❌ CloudSim library: Missing (needed for full simulation)");
        System.out.println("\n📋 To see full CloudSim output:");
        System.out.println("1. Download CloudSim JARs from: https://github.com/Cloudslab/cloudsim/releases");
        System.out.println("2. Create 'lib' directory and add JAR files");
        System.out.println("3. Compile with: javac -cp \".;lib/*\" *.java");
        System.out.println("4. Run with: java -cp \".;lib/*\" org.cloudsim.scheduling.SJF_Scheduler");
    }
}
