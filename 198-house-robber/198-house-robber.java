class Solution {
    public int rob(int[] nums) {
        int[] dp= new int[nums.length];
        if(dp.length==1){
            return nums[0];
        }
        else{
            
            
            dp[1]=Math.max(nums[0],nums[1]);
            dp[0]=nums[0];
            
            for(int i=2;i<dp.length;i++){

                dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            }

            return Math.max(dp[dp.length-1],dp[dp.length-2]);
        }
    }
}