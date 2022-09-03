class Solution {
     public int climbStairs(int n) {
        
         int[] array= new int[n+1];
         Arrays.fill(array,-1);
         
         return climbStairs(n,array);
        
    }
    public int climbStairs(int n,int[] dp) {
        
        
//         if(n<0){
//             return 0;
//         }
        
//         if(n==0){
//             return 1;
//         }
        
//         if(dp[n]!=-1){
//             return dp[n];
//         }
//         else{
//             dp[n] = climbStairs(n-1,dp)+climbStairs(n-2,dp);
//         }
        
//         return dp[n];
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[dp.length-1];
    }
}