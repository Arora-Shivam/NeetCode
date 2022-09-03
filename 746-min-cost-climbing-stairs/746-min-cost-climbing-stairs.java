class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
         int a=cost[0];
         int b=cost[1];
         int c=0;
         for(int i=2;i<cost.length;i++){
             c=Math.min(cost[i]+a,cost[i]+b);
             a=b;
             b=c;
             
         }
         
         return Math.min(a,b);
        
        
       // return minCostClimbingStairs(cost);
    }
    
   //  public int minCostClimbingStairs(int[] cost,int[] dp) {
        
       
//          dp[0]=cost[0];
//          dp[1]=cost[1];
         
//          for(int i=2;i<dp.length;i++){
//              dp[i]=Math.min(cost[i]+dp[i-1],cost[i]+dp[i-2]);
             
//          }
         
//          return Math.min(dp[dp.length-1],dp[dp.length-2]);
         
        
   // }
}