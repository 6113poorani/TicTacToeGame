package game;

public class ViewModel {
    ViewScreen view;
    ViewModel(ViewScreen viewScreen){
        this.view=viewScreen;
    }

    public boolean draw(char[][] grid) {
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]=='\u0000') {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean win(int player,int row,int col,char[][] grid,char letter) {
        if(player==1){
            int i=0;
            for(i=0;i< grid.length;i++){
                if(grid[row][i]!=letter) break;
            }
            if(i==grid.length) return true;
            i=0;
            for(i=0;i< grid.length;i++){
                if(grid[i][col]!=letter) break;
            }
            if(i==grid.length) return true;
            i=0;int j=0;
            while(i< grid.length&&j< grid.length){
                if(grid[i][j]!=letter) break;
                i++;j++;
            }
            if(i== grid.length&&j== grid.length) return true;
            i=0;j= grid.length-1;
            while(i< grid.length&&j>=0){
                if(grid[i][j]!=letter) break;
                i++;j--;
            }
            if(i== grid.length) return true;
        }

        return false;
    }


}
