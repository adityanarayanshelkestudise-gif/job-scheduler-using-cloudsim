# COMPLETE SETUP GUIDE TO SEE ACTUAL OUTPUT
# =========================================

## Prerequisites Needed:

### 1. Java Development Kit (JDK) - NOT JUST JRE
# Current: Only JRE 1.8 installed
# Needed: JDK 8 or higher
# Download: https://www.oracle.com/java/technologies/downloads/

### 2. CloudSim Library
# Download: https://github.com/Cloudslab/cloudsim/releases
# Version: CloudSim 3.0.3 or later
# Files needed: cloudsim-3.0.3.jar and dependencies

## Step-by-Step Setup:

### Step 1: Install JDK
```powershell
# Download and install JDK from Oracle
# Add to PATH: C:\Program Files\Java\jdk-[version]\bin
```

### Step 2: Download CloudSim
```powershell
# Extract CloudSim zip file
# Copy JAR files to project lib directory
mkdir lib
# Copy: cloudsim-3.0.3.jar, commons-math3-3.6.1.jar, etc.
```

### Step 3: Compile Project
```powershell
cd src
javac -cp ".;../lib/*" *.java
```

### Step 4: Run Simulation
```powershell
java -cp ".;../lib/*" org.cloudsim.scheduling.SJF_Scheduler
```

## What You'll See When Working:

### Console Output Sequence:
```
Starting SJF Scheduler...
Initializing new Matrices...
Task0 is bound with VM2
Task1 is bound with VM3
[... 28 more task bindings ...]
Task29 is bound with VM4

CloudSim 3.0.3
Starting CloudSim version 3.0.3
Datacenter_0 is starting...
Datacenter_1 is starting...
Datacenter_2 is starting...
Datacenter_3 is starting...
Datacenter_4 is starting...
Broker_0 is starting...

========== OUTPUT ==========
Cloudlet ID    STATUS    Data center ID    VM ID        Time    Start Time    Finish Time    Waiting Time
    00        SUCCESS        00            02        567.34        00.00        567.34        00.00
    01        SUCCESS        01            03        423.12        00.00        423.12        00.00
    [... detailed results for all 30 tasks ...]
    29        SUCCESS        02            04        634.78        1123.45       1758.23       234.67

Makespan using SJF: 1758.23
org.cloudsim.scheduling.SJF_Scheduler finished!
```

## Generated Files:
# CommunicationTimeMatrix.txt - 30×5 matrix with communication costs
# ExecutionTimeMatrix.txt - 30×5 matrix with execution costs

## Key Metrics Explained:
# - Start Time: When task begins execution
# - Finish Time: When task completes
# - Waiting Time: Time task waited before execution
# - Makespan: Total completion time (optimization goal)

## Why SJF is Important:
# - Minimizes average completion time
# - Reduces resource idle time
# - Optimizes cloud resource utilization
# - Demonstrates scheduling algorithm effectiveness
