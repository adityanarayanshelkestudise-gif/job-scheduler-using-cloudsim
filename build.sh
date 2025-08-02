#!/bin/bash
echo "CloudSim SJF Scheduler Build Script"
echo "==================================="

echo ""
echo "Note: This project requires CloudSim library JAR files to compile and run."
echo "Please download CloudSim from: https://github.com/Cloudslab/cloudsim/releases"
echo ""

echo "Step 1: Extract CloudSim JAR files to a 'lib' directory"
if [ ! -d "lib" ]; then
    echo "Creating lib directory..."
    mkdir lib
    echo "Please copy CloudSim JAR files to the 'lib' directory"
    echo "Then run this script again."
    read -p "Press enter to continue..."
    exit 1
fi

echo "Step 2: Compiling Java source files..."
cd src
javac -cp ".:../lib/*" *.java
if [ $? -ne 0 ]; then
    echo "Compilation failed! Please check for errors above."
    read -p "Press enter to continue..."
    exit 1
fi

echo "Step 3: Compilation successful!"
echo "To run the program, use: java -cp \".:../lib/*\" org.cloudsim.scheduling.SJF_Scheduler"

cd ..
read -p "Press enter to continue..."
