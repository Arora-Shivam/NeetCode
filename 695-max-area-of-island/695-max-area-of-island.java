class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int pad=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    maxAreaOfIsland(grid,i,j);
                   
                    if(pad<count){
                        pad=count;
                    }
                    count=0;
                }
            }
        }
        
        return pad;
    }
    
     int count=0;   
     public void maxAreaOfIsland(int[][] grid,int row,int col) {
        
         if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0){
             return;
         }
         
         if(grid[row][col]==1){
             grid[row][col]=0;
             count++;
         }
         
                maxAreaOfIsland(grid,row+1,col);
                maxAreaOfIsland(grid,row,col+1);
                maxAreaOfIsland(grid,row-1,col);
                maxAreaOfIsland(grid,row,col-1);
             
    }
    
    
    
}