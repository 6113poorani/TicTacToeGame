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

    public boolean win(int player,int row,int col,char[][] grid) {
        if(player==1){
            int i=0;
            for(i=0;i< grid.length;i++){
                if(grid[row][i]!='X') break;
            }
            if(i==grid.length) return true;
            i=0;
            for(i=0;i< grid.length;i++){
                if(grid[i][col]!='X') break;
            }
            if(i==grid.length) return true;
            i=0;int j=0;
            while(i< grid.length&&j< grid.length){
                if(grid[i][j]!='X') break;
                i++;j++;
            }
            if(i== grid.length&&j== grid.length) return true;
            i=0;j= grid.length-1;
            while(i< grid.length&&j>=0){
                if(grid[i][j]!='X') break;
                i++;j--;
            }
            if(i== grid.length) return true;
        }
        else{
            int i=0;
            for(i=0;i< grid.length;i++){
                if(grid[row][i]!='O') break;
            }
            if(i==grid.length) return true;
            i=0;
            for(i=0;i< grid.length;i++){
                if(grid[i][col]!='O') break;
            }
            if(i==grid.length) return true;
            i=0;int j=0;
            while(i< grid.length&&j< grid.length){
                if(grid[i][j]!='O') break;
                i++;j++;
            }
            if(i== grid.length&&j== grid.length) return true;
            i=0;j= grid.length-1;
            while(i< grid.length&&j>=0){
                if(grid[i][j]!='O') break;
                i++;j--;
            }
            if(i== grid.length) return true;
        }
        return false;
    }


}
