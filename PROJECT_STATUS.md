# CloudSim SJF Scheduler Project

## Overview
This project implements a Shortest Job First (SJF) scheduling algorithm for CloudSim simulation framework. The project has been modernized and refactored with improved code structure and documentation.

## Project Structure
```
├── src/
│   ├── Constants.java           # Configuration constants (modernized as SimulationConstants)
│   ├── DatacenterCreator.java   # Factory for creating datacenters
│   ├── GenerateMatrices.java    # Communication and execution matrix generation
│   ├── SJFDatacenterBroker.java # Custom broker implementing SJF scheduling
│   └── SJF_Scheduler.java       # Main simulation class
├── build.bat                    # Windows build script
├── build.sh                     # Unix/Linux build script
└── readme.md                    # This file
```

## Recent Improvements

### ✅ Code Modernization
- **Refactored Constants.java** → **SimulationConstants.java**
  - Added comprehensive Javadoc documentation
  - Implemented utility class pattern with private constructor
  - Used descriptive constant names (CLOUDLET_COUNT, DATACENTER_COUNT, etc.)
  - Made class final to prevent inheritance

- **Fixed Package Names**
  - Updated all files to use proper package: `org.cloudsim.scheduling`
  - Removed placeholder `<package_name>` references

- **Updated References**
  - `Constants.NO_OF_TASKS` → `SimulationConstants.CLOUDLET_COUNT`
  - `Constants.NO_OF_DATA_CENTERS` → `SimulationConstants.DATACENTER_COUNT`
  - `Constants.POPULATION_SIZE` → `SimulationConstants.OPTIMIZATION_POPULATION_SIZE`

### ✅ Project Status
- **Compilation**: ✅ All files compile without errors in IDE
- **Dependencies**: ⚠️ Requires CloudSim JAR files (not included)
- **Code Quality**: ✅ Modern Java practices applied
- **Documentation**: ✅ Comprehensive comments added

## Prerequisites

### Required Software
1. **Java Development Kit (JDK)** 8 or higher
2. **CloudSim Library** (download from [GitHub](https://github.com/Cloudslab/cloudsim/releases))

### IDE Setup (Optional)
- Eclipse, IntelliJ IDEA, or VS Code with Java extension

## Installation & Setup

### Option 1: Command Line Build

1. **Download CloudSim**:
   ```bash
   # Download and extract CloudSim from:
   # https://github.com/Cloudslab/cloudsim/releases
   ```

2. **Setup Library Directory**:
   ```bash
   mkdir lib
   # Copy all CloudSim JAR files to the lib/ directory
   ```

3. **Build and Run**:
   ```bash
   # Windows
   build.bat
   
   # Unix/Linux/Mac
   chmod +x build.sh
   ./build.sh
   ```

### Option 2: IDE Setup

1. **Create Java Project** in your IDE
2. **Copy source files** to the src folder
3. **Add External JARs**:
   - Right-click project → Properties → Java Build Path
   - Libraries → Add External JARs
   - Select all CloudSim JAR files
4. **Run** `SJF_Scheduler.java` as Java Application

## Configuration

The simulation parameters can be modified in `SimulationConstants.java`:

```java
public static final int CLOUDLET_COUNT = 30;                    // Number of tasks
public static final int DATACENTER_COUNT = 5;                   // Number of datacenters
public static final int OPTIMIZATION_POPULATION_SIZE = 25;      // Algorithm population size
```

## Features

- **SJF Scheduling**: Implements Shortest Job First algorithm
- **Multiple Datacenters**: Supports distributed cloud environment
- **Matrix Generation**: Automatic communication and execution time matrices
- **Performance Metrics**: Calculates makespan and execution statistics
- **File Persistence**: Saves/loads matrices to/from files

## Expected Output

The simulation will display:
- Task-to-VM binding information
- Execution results table with:
  - Cloudlet ID, Status, Datacenter ID, VM ID
  - Execution time, Start time, Finish time, Waiting time
- Final makespan calculation

## Troubleshooting

### Common Issues

1. **"Package does not exist" errors**:
   - Ensure CloudSim JAR files are in classpath
   - Verify library files are properly imported

2. **Compilation errors**:
   - Check Java version compatibility (Java 8+)
   - Ensure all source files have correct package declarations

3. **Runtime errors**:
   - Verify matrix files are generated/accessible
   - Check datacenter and VM configuration parameters

## Architecture

### Key Components

1. **SimulationConstants**: Configuration management
2. **DatacenterCreator**: Infrastructure setup
3. **GenerateMatrices**: Performance modeling
4. **SJFDatacenterBroker**: Scheduling logic
5. **SJF_Scheduler**: Simulation orchestration

### Scheduling Algorithm

The SJF scheduler:
1. Generates communication and execution matrices
2. Creates datacenters and virtual machines
3. Assigns cloudlets based on shortest execution time
4. Calculates performance metrics

## License

This project is based on CloudSim framework and follows academic/research usage guidelines.

## References

- [CloudSim Framework](https://github.com/Cloudslab/cloudsim)
- [Original Project Repository](https://github.com/suyash-more/Cloud-Computing-Projects)
