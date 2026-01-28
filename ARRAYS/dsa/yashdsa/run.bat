@echo off
g++ secondlargest.cpp -o secondlargest.exe
if %errorlevel% equ 0 (
    secondlargest.exe
) else (
    echo Compilation failed!
    pause
)
pause 