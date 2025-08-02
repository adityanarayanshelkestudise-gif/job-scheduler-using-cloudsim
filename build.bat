@echo off
echo CloudSim SJF Scheduler Build Script
echo ===================================

echo.
echo Note: This project requires CloudSim library JAR files to compile and run.
echo Please download CloudSim from: https://github.com/Cloudslab/cloudsim/releases
echo.

echo Step 1: Extract CloudSim JAR files to a 'lib' directory
if not exist "lib" (
    echo Creating lib directory...
    mkdir lib
    echo Please copy CloudSim JAR files to the 'lib' directory
    echo Then run this script again.
    pause
    exit /b 1
)

echo Step 2: Compiling Java source files...
cd src
javac -cp ".;../lib/*" *.java
if %errorlevel% neq 0 (
    echo Compilation failed! Please check for errors above.
    pause
    exit /b 1
)

echo Step 3: Compilation successful!
echo To run the program, use: java -cp ".;../lib/*" org.cloudsim.scheduling.SJF_Scheduler

cd ..
pause
