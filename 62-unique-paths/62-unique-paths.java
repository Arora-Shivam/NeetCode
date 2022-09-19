class Solution {
     public int uniquePaths(int m, int n){
         int[][] dp=new int[m][n];
         for(int[] a : dp){
             Arrays.fill(a,-1);
         }
         return uniquePaths(m,n,0,0,dp);
     }
    public int uniquePaths(int m, int n,int i,int j,int[][] dp) {
        
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        else if(i==m-1 && j==n-1){
            return 1;
        }
        else if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int down=uniquePaths(m,n,i+1,j,dp);
        int right=uniquePaths(m,n,i,j+1,dp);
        
        dp[i][j]= down+right;
        
        return dp[i][j];
        
    }
}