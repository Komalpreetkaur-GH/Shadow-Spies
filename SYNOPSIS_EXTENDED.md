# SYNOPSIS

## [FRONT PAGE]

**SYNOPSIS**

**Project Title:** SHADOW SPIES: TACTICAL STEALTH GAME WITH DEVOPS INTEGRATION

**Submitted By:**
**Name of Student:** [YOUR NAME HERE]
**Class / Roll No.:** [YOUR CLASS/ROLL NO HERE]

**Course Code:** INT331
**Course Title:** FUNDAMENTALS OF DEVOPS

**Department:** Computer Science & Engineering

**Submitted To:**
**Instructor Name:** [INSTRUCTOR NAME HERE]

**Session:** 2025-26

---

## 1. Title of the Project
**Shadow Spies: Development and Deployment of a Tactical Strategy Game using Agile DevOps Methodology**

## 2. Introduction
In the rapidly evolving landscape of software engineering, the bridge between "development" (writing code) and "operations" (deploying and maintaining code) has become the most critical component of modern IT infrastructure. This project, titled **Shadow Spies**, aims to simulate a microcosm of this industry environment.

**Shadow Spies** is a two-player, competitive local multiplayer game inspired by the 80s classic *Spy vs Spy*. It challenges players to outwit each other in a grid-based arena, utilizing stealth, trap placement, and resource management to secure a victory. The game brings back the nostalgic charm of shared-screen gaming, fostering direct human interaction.

However, the primary academic significance of this project lies in its development lifecycle. Unlike traditional student projects that focus solely on the output (the `.exe` or `.jar` file), this project emphasizes the **process**. We integrate core DevOps practices—specifically **Version Control (Git)** and **Build Automation (Apache Maven)**—from Day 1. This ensures that the software is not just "written," but scientifically managed, versioned, and built in a reproducible manner, reflecting the standards expected in top-tier software firms.

## 3. Objectives of the Project
The project is driven by specific Functional and Operational objectives designed to meet the outcomes of the **INT331: Fundamentals of DevOps** course.

### A. Functional Objectives (Game Mechanics)
1.  **Simulate Real-Time Strategy**: To design a turn-based or real-time loop where players must make split-second decisions regarding movement and combat.
2.  **Implement Fog of War Algorithms**: To code dynamic visibility logic where the map state is partially hidden, requiring the system to calculate visibility based on player coordinates (Manhattan Distance calculation).
3.  **Inventory & State Management**: To create a robust Object-Oriented system handling Player Health, Trap Count (Inventory), and Scoring (Game State).

### B. Operational Objectives (DevOps Competencies)
1.  **CO3: Demonstrate DevOps Workflow**: To establish a standardized workflow using Git (Branch -> Edit -> Commit -> Merge).
2.  **CO6: Working with Maven**: To replace manual compilation with a declarative build process using `pom.xml`, ensuring dependency management is automated.
3.  **Environment Consistency**: To ensure that the project can be cloned and built on any machine with Java 17 and Maven, eliminating environment-specific bugs.

## 4. Problem Statement / Need of the Project
### The "Works on My Machine" Syndrome
A prevalent issue in software development, particularly in academic settings (and junior professional roles), is the lack of standardization. Code written on one developer's laptop often fails to run on another's due to missing libraries, classpath errors, or different compiler versions.

### The Integration Chaos
Without a robust Version Control System (VCS), collaborating on code becomes a nightmare of manual file copying (`Project_Final_v2_Final.zip`). This leads to code overwrites, data loss, and an inability to track when and why a bug was introduced.

### The Solution: DevOps Integration
**Shadow Spies** addresses these problems by enforcing a **Configuration-as-Code** approach:
*   **Git** acts as the single source of truth, creating a verifiable history of every change.
*   **Maven** defines the "recipe" for building the software, meaning the build process is documented in code (`pom.xml`) rather than in a text document or human memory.

## 5. Scope of the Project
The scope delineates the technical boundaries and the extent of the features to be implemented.

### 5.1 Technical Scope
*   **Language**: Java SE 17 (LTS).
*   **UI Library**: Java Swing (Lightweight UI Toolkit) for Windows/Linux compatibility.
*   **Architecture**: MVC (Model-View-Controller) pattern to separate Game Logic (Model) from Rendering (View) and Input (Controller).

### 5.2 Functional Modules
*   **The Arena**: A 15x15 grid map containing Safe Zones, Trap Zones, and Obstacles.
*   **The Agents**: Two distinct player entities (White Spy / Black Spy) with independent input channels (WASD vs Arrow Keys).
*   **The Mechanics**:
    *   *Trap Logic*: Invisible entities that trigger state changes (Health reduction/Score deduction) upon collision.
    *   *Item Logic*: Random generation of the "Secret Data" object at runtime.
    *   *Fog Logic*: Rendering obscurant layers over cells distance > 3 from the player.

### 5.3 DevOps Scope
*   **Source Control Management (SCM)**:
    *   Repository initialization and remote linking.
    *   Standard `.gitignore` implementation to prevent artifact bloat.
    *   Commit message convention adherence (e.g., "feat: add player logic").
*   **Build Lifecycle Management**:
    *   `mvn clean`: Removal of stale build artifacts.
    *   `mvn compile`: Compilation of source code.
    *   `mvn package`: Generation of the distributable `shadow-spies-1.0.jar`.

## 6. Methodology / Tools Used
We follow the **Agile Iteration Methodology**, breaking the development into 1-week Sprints.

### A. Tools & Technologies
| Category | Tool Selected | Purpose |
| :--- | :--- | :--- |
| **Language** | **Java 17** | Robust, object-oriented, platform-independent core logic. |
| **IDE** | **VS Code / IntelliJ** | Integrated Development Environment for code editing. |
| **VCS** | **Git** | Distributed Version Control System for tracking history. |
| **Build Tool** | **Apache Maven** | Dependency management and build automation. |
| **Docs** | **Markdown** | For maintaining README and Documentation as code. |

### B. The DevOps Pipeline Implemented
1.  **Code**: Development of features in a local `feature/Branch`.
2.  **Commit**: Staging files and committing with descriptive logs.
3.  **Build**: Local execution of `mvn package` to verify code integrity.
4.  **Test**: Manual play-testing (MVP phase) to verify mechanics.
5.  **Release**: Tagging the commit on the `master` branch as a Release Candidate.

## 7. Expected Outcomes
By the end of this project lifecycle, we will deliver:

### Tangible Deliverables
1.  **Source Code Repository**: A clean, uniform Git repository with at least 20+ commits showing the history of development.
2.  **Executable Artifact**: A cross-platform `JAR` file that runs the game on any computer with Java installed, with no additional setup.
3.  **Project Report**: A comprehensive document detailing the class structure and build instructions.
4.  **Manual**: A helper guide (README) for new players.

### Intangible Outcomes (Learning)
1.  **Mastery of Git**: Confidence in using CLI commands for branching and merging.
2.  **Maven Proficiency**: Understanding the Project Object Model hierarchy and lifecycle phases.
3.  **System Design**: Experience in architecting a real-time interactive system using Java.

## 8. Project Timeline (Gantt Chart Approximation)

*   **Week 1: Requirement Gathering & Environment Setup**
    *   Installation of Java JDK, Git, and Maven.
    *   Creation of the Git Repository (`git init`).
    *   Definition of Game Rules and Grid Layout.

*   **Week 2: Core Skeleton Implementation**
    *   Development of `Student.java` (Player class) and `Grid.java`.
    *   Implementation of Basic Movement Algorithms.
    *   **Unit I Goal**: First successful Commit and Push to Remote.

*   **Week 3: Game Mechanics & UI**
    *   Integration of Java Swing for visual output.
    *   Implementation of KeyListeners for dual-input.
    *   Coding the "Trap" and "Item" interaction logic.

*   **Week 4: DevOps Integration & Refactoring**
    *   Conversion of standard project to Maven Project (`mvn archetype:generate`).
    *   Moving source files to `src/main/java`.
    *   **Unit VI Goal**: Successful build using `mvn package`.

*   **Week 5: Final Polish & Submission**
    *   UI Asset cleanup (Blueprint theme).
    *   Writing the Synopsis and User Manual.
    *   Final Presentation preparation.

## 9. References
1.  **Bass, L., Weber, I., & Zhu, L.** (2015). *DevOps: A Software Architect's Perspective*. Addison-Wesley Professional. (Textbook Reference).
2.  **Chacon, S., & Straub, B.** (2014). *Pro Git*. Apress. Available at: [https://git-scm.com/book/en/v2](https://git-scm.com/book/en/v2)
3.  **The Apache Software Foundation**. (2023). *Maven in 5 Minutes*. Available at: [https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
4.  **Oracle**. (2024). *The Java Tutorials: Creating a GUI with Swing*. Oracle Documentation.
5.  **Gamma, E., Helm, R., Johnson, R., & Vlissides, J.** (1994). *Design Patterns: Elements of Reusable Object-Oriented Software*. Addison-Wesley.
