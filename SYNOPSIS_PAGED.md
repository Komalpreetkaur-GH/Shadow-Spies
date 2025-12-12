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
**Shadow Spies: A Tactical Stealth Strategy Game Implemented with DevOps Methodologies**

## 2. Introduction
**Shadow Spies** is a two-player, local competitive turn-based strategy game. Inspired by classic stealth games, it places two players in a shared grid-based arena. The core gameplay loop involves navigating a maze-like environment shrouded in dynamic "Fog of War," locating hidden intelligence assets, and escaping safely while avoiding traps placed by the opponent.

While the project delivers a functional and entertaining game, its academic purpose is to serve as a practical vessel for implementing modern **DevOps** practices. By integrating Version Control (Git) and Build Automation (Maven) into the development lifecycle, this project demonstrates how software engineering bridges the gap between raw code creation and reliable software delivery.

---

# SYNOPSIS - PAGE 2 (Objectives & Problem Statement)

## 3. Objectives of the Project
The project aims to achieve specific technical benchmarks aligned with the course outcomes of **Fundamentals of DevOps**:

1.  **Develop a Robust Game Engine**: To create a Java-based simulation that handles real-time input from two users simultaneously, managing complex state logic like health, inventory, and scoring.
2.  **Implement Version Control Best Practices (CO3)**: To utilize **Git** for tracking every stage of development, demonstrating branching, merging, and remote repository management.
3.  **Automate Build Processes (CO6)**: To transition from manual command-line compilation to a standardized **Apache Maven** build lifecycle, ensuring the project is portable and reproducible.

## 4. Problem Statement / Need of the Project
**The Consistency Challenge**:
In academic and junior professional environments, the "It works on my machine" syndrome is rampant. Code that runs perfectly on one developer's laptop often fails on another due to path configuration errors or missing dependencies.

**The Collaboration Gap**:
Without a centralized Version Control System, teams often resort to manual file sharing (e.g., emailing ZIP files). This antiquated method leads to:
*   **Data Loss**: accidental overwrites of newer code.
*   **Integration Hell**: inability to merge features from different developers.
*   **Zero Traceability**: no history of who made changes and why.

**The Solution**:
This project solves these issues by enforcing a "Configuration as Code" philosophy using a standard `pom.xml` for builds and a clean Git history for collaboration.

---

# SYNOPSIS - PAGE 3 (Scope & Methodology)

## 5. Scope of the Project
The scope defines the specific boundaries of the implementation.

**Functional Game Scope**:
*   **mechanics**: Grid-based movement, Trap placement, Item collection, Win/Loss conditions.
*   **Platform**: Desktop Application (Windows/Linux/MacOS) running on Java Runtime Environment (JRE) 17+.
*   **Interface**: 2D Graphical User Interface using Java Swing.

**DevOps Scope**:
*   **SCM**: Implementation of local Git repository and remote GitHub synchronization.
*   **Build**: Use of Maven for dependency resolution (`junit`, etc.) and packaging (`.jar` generation).
*   **Exclusion**: This phase does not include Docker containerization or Cloud Deployment (AWS/Azure), focusing strictly on the Build and Code stages.

## 6. Methodology / Tools Used
The project follows an **Iterative Development Model**.

**A. Core Technologies**:
*   **Java 17**: The primary language for game logic.
*   **Java Swing**: For rendering the graphical interface.

**B. DevOps Toolchain**:
*   **Git**: Used for source code management. We utilize a `feature-branch` workflow where new mechanics (like 'Traps') are built in isolation before being merged to the `master` branch.
*   **Apache Maven**: Acts as the project management tool. It standardizes the directory structure (`src/main/java`) and creates the build artifacts automatically.

---

# SYNOPSIS - PAGE 4 (Outcomes & Timeline)

## 7. Expected Outcomes
Upon successful completion, this project will deliver:

**Tangible Deliverables**:
1.  **Playable Software**: A `shadow-spies.jar` file that can be executed on any standard computer to play the game.
2.  **Source Code**: A simplified, clean codebase organized according to Maven standards.
3.  **DevOps History**: A Git repository containing a verified log of commits, demonstrating the evolution of the project from empty folder to finished product.

**Intangible Learning Outcomes**:
1.  **Proficiency in Git CLI**: Mastery of commands like `commit`, `push`, `pull`, and `status`.
2.  **Maven Lifecycle**: Understanding the difference between `compile`, `test`, and `package` phases.

## 8. Project Timeline
| Phase | Duration | Key Activity |
| :--- | :--- | :--- |
| **Week 1** | 5 Days | **Setup**: Install Git/Maven, Initialize Repo. |
| **Week 2** | 7 Days | **Core Logic**: Code Player/Grid classes. First Commit. |
| **Week 3** | 7 Days | **UI Design**: Implement Main Window and Graphics. |
| **Week 4** | 5 Days | **Maven Integration**: Create POM.xml, standardize folder structure. |
| **Week 5** | 3 Days | **Final Polish**: Write documentation and submit Synopsis. |

---

# SYNOPSIS - PAGE 5 (References)

## 9. References

**Textbooks & Academic Resources**:
1.  **Bass, L., Weber, I., & Zhu, L.** (2015). *DevOps: A Software Architect's Perspective*. Addison-Wesley Professional.
2.  **Loeliger, J., & McCullough, M.** (2012). *Version Control with Git*. O'Reilly Media.

**Documentation & Online Standards**:
3.  **Official Git Documentation**: [https://git-scm.com/doc](https://git-scm.com/doc)
4.  **Apache Maven Project**: [https://maven.apache.org/guides/](https://maven.apache.org/guides/)
5.  **Oracle Java Documentation**: [https://docs.oracle.com/en/java/javase/17/](https://docs.oracle.com/en/java/javase/17/)

**Course Material**:
6.  **INT331 - Fundamentals of DevOps**: Lecture Notes and Practical Lab Manuals (Units I, III, VI).
