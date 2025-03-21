# Tic Tac Toe Game in Java

## 🌎 Description
This is a fully interactive **Tic Tac Toe game** implemented in **Java**. It uses a modular, object-oriented approach with three core classes:
- `TicTacToeBoard` for game board logic
- `TicTacToePlayer` for player information and input
- `TicTacToeGame` as the controller that runs the game

Players take turns placing their chosen symbols (`X`, `O`, etc.) on a 3x3 grid. The first player to align three of their symbols in a row, column, or diagonal wins. The game also handles draw conditions and invalid moves.

## 🎓 Authors
- Clovis Mushagalusa CIRUBAKADERHA
- Faith Rovina
- Innocent Chikwanda
- Konama Shulammite

## 🔍 Features
- Turn-based 2-player gameplay
- Input validation (unique symbols and names)
- Detection of win or draw
- Nicely printed board view
- User prompts for position input and feedback

## 📚 Classes
### ✅ TicTacToeBoard.java
- Handles board initialization, printing, and validation
- Detects win conditions in rows, columns, and diagonals

### ✅ TicTacToePlayer.java
- Collects player's name and symbol with input validation

### ✅ TicTacToeGame.java
- Runs the game loop and manages turns
- Ensures fair play (no name or symbol duplication)
- Announces winner or draw at the end

## ⚖️ How to Run
### 📅 Compile:
```bash
javac TicTacToeBoard.java TicTacToePlayer.java TicTacToeGame.java
```

### ▶️ Run:
```bash
java TicTacToeGame
```

## 🚀 Sample Gameplay
```text
Player1, please enter your information.
What is your name? Alice
What symbol would you like to use? X

Player2, please enter your information.
What is your name? Bob
What symbol would you like to use? O

Who will go first? (Enter 1 or 2) 1

Alice will go first.
Initially, the board looks like:
  0 1 2
0 . . .
1 . . .
2 . . .

Alice, in which row do you want to play? 0
Alice, in which column do you want to play? 1

The board now looks like:
  0 1 2
0 . X .
1 . . .
2 . . .
...
```

## 🚨 Win Detection
- Game ends immediately if 3 symbols align in a row, column, or diagonal.
- The winner's symbol is displayed with a congratulatory message.

---
Enjoy playing! Contributions are welcome to improve the UI or add an AI opponent! 🌟

