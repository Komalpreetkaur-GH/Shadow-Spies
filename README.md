# Spy vs Spy

A simplified 2-player local game inspired by the classic "Spy vs Spy," developed as a DevOps Fundamentals project.

## 📋 Project Overview

This project demonstrates the application of key DevOps tools and practices:
*   **Java**: The core programming language.
*   **Maven**: Used for build automation, dependency management, and project standardization.
*   **Git**: Used for version control and source code management.
*   **JUnit 5**: Used for automated testing.

## 🚀 How to Run

### Prerequisites
*   Java Development Kit (JDK) 8 or higher
*   Maven 3.6 or higher

### Quick Start (Windows)
We have included an automated script to build and run the game in one step:

```cmd
.\run.bat
```

### Manual Commands
If you prefer running Maven commands manually:

1.  **Build & Test:**
    ```bash
    mvn clean package
    ```

2.  **Run the Game:**
    ```bash
    mvn exec:java
    ```
    *Or run the executable JAR directly:*
    ```bash
    java -jar target/spy-vs-spy-1.0-SNAPSHOT.jar
    ```

## 🛠️ Tech Stack & DevOps Implementation

| Component | Tool Used | Purpose |
| :--- | :--- | :--- |
| **Language** | Java 8 | Core game logic and UI. |
| **Build Tool** | **Maven** | Automates compilation, testing, and packaging. Configured via `pom.xml`. |
| **Version Control** | **Git** | Tracks changes. `.gitignore` ensures a clean repository by excluding build artifacts. |
| **Testing** | **JUnit 5** |  Unit tests run automatically during the `mvn package` phase. |

## 📂 Project Structure

Following the standard Maven directory layout:

```text
spy-vs-spy/
├── src/
│   ├── main/java/       # Source code (Game logic & UI)
│   └── test/java/       # Unit tests
├── target/              # Compiled build output (ignored by Git)
├── pom.xml              # Maven configuration (Dependencies & Plugins)
├── .gitignore           # Specifies files to exclude from Git
└── run.bat              # Automation script
```

## 🎮 Game Controls

*   **Player 1 (Blue):** `W`, `A`, `S`, `D` to move.
*   **Player 2 (Red):** `Arrow Keys` to move.
*   **Objective:** Navigate the grid, find the Briefcase, and exit the building before your opponent!
