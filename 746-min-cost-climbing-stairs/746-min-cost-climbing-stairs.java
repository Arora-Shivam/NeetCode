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
        
        
      
    }
    
  
}