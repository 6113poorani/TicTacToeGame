package game;

import java.util.Scanner;

public class ViewScreen {
    ViewModel viewModel;
    public ViewScreen(){
        this.viewModel=new ViewModel(this);
    }
    public void gameOn(int playerNo,char[][] grid) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the row and col : ");
        int row=scn.nextInt();
        int col=scn.nextInt();
        if(row<0||row>= grid.length||col<0||col>= grid.length){
            System.out.println("Invalid choice");
            gameOn(playerNo,grid);
        }
        if(grid[row][col]!='\u0000'){
            System.out.println("The cell is already filled");
            gameOn(playerNo,grid);
        }
        char letter=playerNo==1?'X':'O';
        grid[row][col]=letter;
        printBoard(grid);
        if(viewModel.win(playerNo,row,col,grid,letter)==true){
            System.out.println(playerNo+" Won the Match ");
            System.exit(0);
        }
        if(viewModel.draw(grid)==true){
            System.out.println("The Match is draw");
            System.exit(0);
        }
        gameOn(playerNo==1?2:1,grid);
    }

    private void printBoard(char[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]=='X'||grid[i][j]=='O'){
                    System.out.print(grid[i][j]+" ");
                }
                else{
                    System.out.print("_"+" ");
                }
            }
            System.out.println();
        }
    }


}
