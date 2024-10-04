package dto;

import java.util.Scanner;

public class TicTacToe {
    char[][] grid;

    public TicTacToe(int row,int col) {
        this.grid = new char[row][col];
    }

    public char[][] getGrid() {
        return grid;
    }
}
