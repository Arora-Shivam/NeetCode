class Solution {
    
    public int maxProduct(int[] nums) {
        
        int[][] dp=new int[nums.length][2];  
        dp[0][0]=nums[0];
        dp[0][1]=nums[0];
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==0){
                dp[i][0]=1;
                dp[i][1]=1;
                max=Math.max(max,0);
            }
            else{
                dp[i][0]=Math.max(dp[i-1][0]*nums[i],Math.max(dp[i-1][1]*nums[i],nums[i]));
                dp[i][1]=Math.min(dp[i-1][0]*nums[i],Math.min(dp[i-1][1]*nums[i],nums[i]));
                max=Math.max(max,Math.max(dp[i][0],dp[i][1]));
            }
            
        }
        for(int[] d : dp){
            System.out.println(Arrays.toString(d));
        }     
        
        return max;
    }
    
  
}