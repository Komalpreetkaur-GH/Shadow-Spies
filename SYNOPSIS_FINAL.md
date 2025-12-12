# SYNOPSIS - PAGE 1 (Front Page & Title)

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

**Shadow Spies** is a two-player, competitive local multiplayer game inspired by the 80s classic *Spy vs Spy*. It challenges players to outwit each other in a grid-based arena, utilizing stealth, trap placement, and resource management to secure a victory.

However, the primary academic significance of this project lies in its development lifecycle. Unlike traditional student projects that focus solely on the output (the `.exe` or `.jar` file), this project emphasizes the **process**. We integrate core DevOps practices—specifically **Version Control (Git)** and **Build Automation (Apache Maven)**—from Day 1. This ensures that the software is not just "written," but scientifically managed, reflecting top-tier industry standards.

---

# SYNOPSIS - PAGE 2 (Objectives & Problem Statement)

## 3. Objectives of the Project
The project is driven by specific Functional and Operational objectives designed to meet the outcomes of the **INT331: Fundamentals of DevOps** course.

**A. Functional Objectives (Game Mechanics)**:
1.  **Simulate Real-Time Strategy**: To design a turn-based loop where players must make split-second decisions regarding movement and combat.
2.  **Implement Visibility Algorithms**: To code dynamic "Fog of War" logic where the map state is partially hidden, requiring the system to calculate visibility based on player coordinates.
3.  **State Management**: To create a robust Object-Oriented system handling Player Health, Inventory, and Game Scores.

**B. Operational Objectives (DevOps Competencies)**:
1.  **CO3: Demonstrate DevOps Workflow**: To establish a standardized workflow using Git (Branch -> Edit -> Commit -> Merge).
2.  **CO6: Working with Maven**: To replace manual compilation with a declarative build process using `pom.xml`, ensuring dependency management is automated.
3.  **Environment Consistency**: To ensure that the project can be cloned and built on any machine with Java 17 and Maven.

## 4. Problem Statement / Need of the Project
**The "Works on My Machine" Syndrome**:
A prevalent issue in software development is the lack of standardization. Code written on one developer's laptop often fails to run on another's due to missing libraries, classpath errors, or different compiler versions.

**The Integration Chaos**:
Without a robust Version Control System (VCS), collaborating on code becomes a nightmare. This leads to code overwrites, data loss, and an inability to track when and why a bug was introduced.

**The Solution**:
**Shadow Spies** addresses these problems by enforcement:
*   **Git** acts as the single source of truth, creating a verifiable history of every change.
*   **Maven** defines the "recipe" for building the software in code (`pom.xml`), eliminating manual steps.

---

# SYNOPSIS - PAGE 3 (Scope & Methodology)

## 5. Scope of the Project
The scope delineates the technical boundaries and the extent of the features to be implemented.

**Functional Scope**:
*   **Mechanics**: Grid-based movement, Trap placement logic, Item randomization, Win/Loss state detection.
*   **User Interface**: A 2D graphical window (JFrame) using Java Swing with custom "Blueprint" asset rendering.
*   **Limitations**: The current scope is limited to Local Multiplayer (Shared Keyboard).

**DevOps Scope**:
*   **SCM**: Git (Add, Commit, Push, Pull, Branching strategies).
*   **Build Tool**: Maven (Validate, Compile, Test, Package phases).
*   **Platform**: The artifact will be platform-independent thanks to Java and Maven.

## 6. Methodology / Tools Used
The project follows an **Iterative Development Methodology**, where features are added in small increments, committed to version control, and verifiable via the build tool.

**A. Methodology Flowchart**:
The following flowchart illustrates the DevOps pipeline adopted for this project:

```mermaid
graph TD
    A[Start: Development] --> B[Step 1: Create Feature Branch (Git)];
    B --> C[Step 2: Write Java Code (IDE)];
    C --> D{Step 3: Maven Build};
    D -- Fail --> C;
    D -- Pass --> E[Step 4: Commit & Push to GitHub];
    E --> F[Step 5: Merge to Master];
    F --> G[Step 6: Generate JAR Artifact];
    G --> H[End: Playable Game];
```
*(Note: In your document, draw this as boxes connected by arrows)*

**B. Tools Selected**:
*   **Java 17**: Core programming language.
*   **Git**: Distributed Version Control System.
*   **Apache Maven**: Build Automation Tool.

---

# SYNOPSIS - PAGE 4 (Outcomes & Timeline)

## 7. Expected Outcomes
Upon completion of the project, the following outcomes are expected:

**Tangible Outcomes**:
1.  **A Playable Game**: A fully functional `shadow-spies.jar` file that launches the game.
2.  **Robust Source Control**: A GitHub repository showing a clear history of development with at least 20+ commits.
3.  **Standardized Build**: A project that can be downloaded and built by anyone with Maven installed using a single command (`mvn package`).

**Skill Acquisition**:
1.  **Practical Mastery**: Hands-on experience with DevOps fundamentals (CO1, CO6).
2.  **Java Proficiency**: Deepened understanding of Object-Oriented Programming and Swing UI.

## 8. Project Timeline
| Phase | Duration | Activity |
| :--- | :--- | :--- |
| **I** | Week 1 | **Planning & Setup**: Defining requirements, setting up Git Repo, Initializing Maven Project. |
| **II** | Week 2 | **Core Logic**: Coding Player.java, MapGrid.java, and implementing basic movement. |
| **III** | Week 3 | **UI Development**: Integrating Swing, designing the "Blueprint" theme, connecting inputs. |
| **IV** | Week 4 | **DevOps Integration**: Refactoring structure for Maven, configuring `pom.xml`, testing Build success. |
| **V** | Week 5 | **Testing & Documentation**: Final bug fixes, README creation, and Synopsis submission. |

---

# SYNOPSIS - PAGE 5 (References)

## 9. References

**Books**:
1.  **Bass, L., Weber, I., & Zhu, L.** (2015). *DevOps: A Software Architect's Perspective*. Addison-Wesley Professional.
2.  **Loeliger, J., & McCullough, M.** (2012). *Version Control with Git*. O'Reilly Media.

**Documentation**:
3.  **Official Git Documentation**: [https://git-scm.com/doc](https://git-scm.com/doc)
4.  **Apache Maven Project**: [https://maven.apache.org/guides/](https://maven.apache.org/guides/)
5.  **Oracle Java Documentation**: [https://docs.oracle.com/en/java/javase/17/](https://docs.oracle.com/en/java/javase/17/)

**Course Material**:
6.  **INT331 - Fundamentals of DevOps**: Class Lecture Notes and Lab Manuals (Units I, III, VI).
7.  **IEEE Xplore**: Research papers on Agile Game Development.
