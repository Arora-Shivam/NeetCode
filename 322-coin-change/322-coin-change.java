class Solution {
    
    int pad=-1;
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        
        Arrays.fill(dp,-1);
        int x=coinChange(coins,amount,dp);
        return x==Integer.MAX_VALUE/2 ? -1 : x;
    }
    
     public int coinChange(int[] coins, int amount,int[] dp) {
       
        
         if(amount==0){
             return 0;
         }
         if(dp[amount]!=-1){
             return dp[amount];
         }
         else{
         dp[amount]=Integer.MAX_VALUE/2;
         
         for(int i : coins){
             
             if(amount-i>=0)
             dp[amount]=Math.min(dp[amount],coinChange(coins,amount-i,dp)+1);
         }
         }
         return dp[amount];
    }
}