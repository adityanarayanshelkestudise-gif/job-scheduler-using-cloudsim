# job-scheduler-using-cloudsim
# ☁️ CloudSim SJF Scheduler

A Java-based simulation of the **Shortest Job First (SJF)** scheduling algorithm using the **CloudSim** framework. This project demonstrates how tasks (cloudlets) can be efficiently assigned to virtual machines across multiple datacenters to minimize execution time (makespan).

## 🚀 Features
- Implements SJF scheduling in a cloud environment
- Simulates 5 datacenters and 30 tasks with dynamic cost matrices
- Outputs performance metrics: makespan, waiting time, VM mapping
- Modern Java (JDK 21) codebase with build scripts

## 🛠️ Requirements
- Java 8+ (✅ tested on JDK 21)
- CloudSim 3.0.3 library (download manually)

## 📦 Structure
- `src/` – Java source files
- `build.sh / build.bat` – Compile & run scripts
- `readme-to-start.md` – Project guide and setup

## 📖 Credits
Based on original work by [suyash-more](https://github.com/suyash-more), with improvements in structure, documentation, and code modernization.
