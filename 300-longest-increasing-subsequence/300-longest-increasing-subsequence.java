class Solution {
    
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        
        return lengthOfLIS(nums,dp);
    }
    
     public int lengthOfLIS(int[] nums,int[] dp) {
        
         for(int i=0;i<nums.length;i++){
             
             for(int j=i+1;j<nums.length;j++){
                 
                 if(nums[i]<nums[j] && dp[j]==dp[i]){
                     dp[j]++;
                 }
             }
         }
         
         int pad=dp[0];
         
         for(int i : dp){
             if(pad<i){
                 pad=i;
             }
         }
         
         return pad;
    }
}