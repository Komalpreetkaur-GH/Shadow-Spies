# Project Implementation Log: Maven & Git Integration

This document details the transformation of the "Spy vs Spy" project from a simple Java project to a standardized Maven project with proper Git configuration.

## 1. Project Restructuring

**Why:** Maven expects a standard directory structure (`src/main/java`). This makes the project instantly understandable to any other Java developer and compatible with standard tools.

**What we did:**
We moved the source code to match Maven conventions.

**Commands Used:**
```powershell
# Create the standard directory tree
mkdir -p src/main/java

# Move existing code (using git mv to preserve history)
git mv src/game src/main/java/game
git mv src/ui src/main/java/ui
```

---

## 2. Maven Integration (pom.xml)

**Why:** `pom.xml` (Project Object Model) is the heart of a Maven project. It tells Maven how to build your software, what dependencies it needs, and how to run it.

**What we did:**
We created a `pom.xml` file in the project root.

**Key Components Explained:**
*   **`<groupId>` / `<artifactId>` / `<version>`**: Unique identifiers for your project.
    *   `com.spyvsspy` (Group): Similar to a Java package name.
    *   `spy-vs-spy` (Artifact): The name of the project/jar.
*   **`<maven.compiler.source>`**: Tells Maven to compile code compatible with Java 8 (1.8).
*   **`maven-compiler-plugin`**: The actual tool that compiles your `.java` files into `.class` files.
*   **`exec-maven-plugin`**: Allows you to run the game easily with `mvn exec:java`. We configured it with `<mainClass>game.Game</mainClass>` so it knows where to start.
*   **`maven-jar-plugin`**: Configured to create an **Executable JAR**.
    *   We added the `<manifest>` section to specify `Main-Class: game.Game`. This allows you to run the jar by double-clicking it or using `java -jar`.

---

## 3. Git Integration (.gitignore)

**Why:** You never want to commit generated files (like `.class` files or the `target/` directory) to Git. They clutter the history and can cause conflicts.

**What we did:**
We created a `.gitignore` file.

**Key Entries:**
*   `target/`: Ignores the entire folder where Maven puts built files.
*   `out/`: Ignores the folder from our old build method.
*   `*.class`: Ignores compiled bytecode.

---

## 4. Build & Execution

**Why:** To ensure the project works after changes.

**Commands Used:**
```powershell
# Clean previous builds and package the application (compile + verify + jar)
mvn clean package

# Run the application directly from source
mvn exec:java -Dexec.mainClass="game.Game" (or simply 'mvn exec:java' as we configured it)
```

**Result:**
*   A newly generated executable file located at: `target/spy-vs-spy-1.0-SNAPSHOT.jar`.
*   You can run this file anywhere with Java installed: `java -jar target/spy-vs-spy-1.0-SNAPSHOT.jar`.

---

## 5. Automation (run.bat)

**Why:** To make it one-click easy for you to run the project without remembering Maven commands.

**Content:**
```batch
@echo off
echo Building with Maven...
call mvn clean package
echo Starting application...
call mvn exec:java
```
This script automates the entire "Build -> Run" cycle.
