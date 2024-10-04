# TicTacToeGame
Question: Build a Simple Console-Based Tic-Tac-Toe Game
Duration: 2 hours
Write a Java program that allows two players to play the classic game of Tic-Tac-Toe on a 3x3
board.
Game Rules:
1. The game is played on a 3x3 grid.
2. Players take turns entering their moves. One player uses "X", and the other uses "O".
3. A player wins by getting 3 of their symbols in a row, column, or diagonal.
4. The game ends when:
- One of the players wins.
- The board is filled, and no player has won (i.e., a draw).
Task:
1. Design and implement the Tic-Tac-Toe board using a 2D array.
2. Allow players to input their moves through the console (row and column numbers).
3. After each move, display the updated board.
4. Implement logic to check for a win or a draw.
5. Handle invalid moves (e.g., placing a mark in an already occupied cell).
6. Once the game is over, display the result (which player won, or if it was a draw).
Constraints:
- The board is a 3x3 grid.
- Players alternate between entering their move.
- Input validation is required to ensure a move is within the valid range (0-2) and that the chosen
cell is empty.
Example of Expected Console Output:
Player 1 (X), enter your move (row and column): 0 1
_ X _
_ _ _
_ _ _
Player 2 (O), enter your move (row and column): 1 1
_ X _
_ O _
_ _ _
...
Player 1 (X), enter your move (row and column): 0 0
X X _
_ O _
_ _ _
...
Congratulations, Player 1 (X) wins!
Tips:
- Use a loop to keep asking for player input until the game is over.
- A method to check the winning conditions (three in a row, column, or diagonal) will simplify
your code.
- Implement good practices for code readability, including methods for key tasks (e.g., checking
for a winner, displaying the board, and processing moves).
