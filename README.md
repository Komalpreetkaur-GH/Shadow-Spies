# Spy vs Spy (Java Swing MVP)

A local multiplayer stealth game inspired by the classic concept. Two players compete on a grid to find secret data and escape, using traps and stealth to outsmart each other.

![Blueprint Theme](https://via.placeholder.com/800x400?text=Spy+vs+Spy+Blueprint+Theme)

## 🎮 Game Overview
- **Objective**: Search the grid to find the **Secret Data (Briefcase)**. Once you have it, reach the **Exit (Green Zone)** to win.
- **Fog of War**: You can only see your immediate surroundings. The rest of the map is hidden in darkness.
- **Traps**: Use your limited supply of traps to guard key locations. Traps are invisible to your opponent (mostly).

## ⌨️ Controls
This game is designed for **Local Multiplayer** (Shared Keyboard).

| Action | **Player 1 (White Spy)** | **Player 2 (Black Spy)** |
| :--- | :---: | :---: |
| **Move Up** | `W` | `↑` (Up Arrow) |
| **Move Down** | `S` | `↓` (Down Arrow) |
| **Move Left** | `A` | `←` (Left Arrow) |
| **Move Right** | `D` | `→` (Right Arrow) |
| **Place Trap** | `Q` | `M` |

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 17 or higher.

### Command Line
1. **Navigate to the project folder**:
   ```bash
   cd spy-vs-spy
   ```

2. **Compile the source code**:
   ```bash
   javac -d out src/game/*.java src/ui/*.java
   ```

3. **Run the game**:
   ```bash
   java -cp out game.Game
   ```

## 📂 Project Structure
```
spy-vs-spy/
├── src/
│   ├── game/           # Core Game Logic
│   │   ├── Game.java       # Main Entry Point
│   │   ├── GameState.java  # World State & Logic
│   │   ├── MapGrid.java    # Grid Data Structure
│   │   ├── Player.java     # Player Attributes
│   │   ├── Trap.java       # Trap Logic
│   │   ├── Item.java       # Data/Exit Logic
│   │   └── Visibility.java # Fog of War Logic
│   └── ui/             # Graphical User Interface
│       ├── GameWindow.java # JFrame Setup
│       ├── GridPanel.java  # Rendering (Blueprint Theme)
│       └── InputHandler.java # Keyboard Listener
└── out/                # Compiled Bytecode
```

## 🔧 Future Improvements
- [ ] Maze generation (Walls)
- [ ] Networked multiplayer (Sockets)
- [ ] Sound effects
- [ ] Power-ups (Speed, Radar)
