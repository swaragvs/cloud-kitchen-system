@echo off
REM Navigate to the project directory
cd C:\Users\Lenovo\Desktop\Project - Copy\food-delivery-system\main

REM Compile the Java files
echo Compiling Java files...
javac -d ..\bin -sourcepath ..\src Main.java

REM Run the main class
echo Running the application...
java -cp ..\bin main.Main

pause
