@echo off
echo Building with Maven...
call mvn clean package
if %errorlevel% neq 0 (
    echo Build failed!
    exit /b %errorlevel%
)

echo Starting application...
call mvn exec:java
