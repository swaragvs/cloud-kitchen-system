@echo off
echo Compiling Java files with -Xlint:unchecked...

rem Set the source directory and output directory
set SOURCE_DIR=..\src
set OUTPUT_DIR=..\bin

rem Compile Java files with -Xlint:unchecked
javac -Xlint:unchecked -cp .;%SOURCE_DIR%\path\to\your\dependencies\* %SOURCE_DIR%\main\*.java %SOURCE_DIR%\service\*.java %SOURCE_DIR%\gui\*.java %SOURCE_DIR%\model\*.java %SOURCE_DIR%\util\*.java -d %OUTPUT_DIR%

rem Check if compilation was successful
if %errorlevel% neq 0 (
    echo Error: Compilation failed.
    pause
    exit /b %errorlevel%
)

echo Compilation successful. Running the application...

rem Run the Main class
java -cp %OUTPUT_DIR%;%SOURCE_DIR%\path\to\your\dependencies\* main.Main

pause
