class Solution {
    public int rob(int[] nums) {
//         int[] dp= new int[nums.length];
//         if(dp.length==1){
//             return nums[0];
//         }
//         else{
            
            
//             dp[1]=Math.max(nums[0],nums[1]);
//             dp[0]=nums[0];
            
//             for(int i=2;i<dp.length;i++){

//                 dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
//             }

//             return Math.max(dp[dp.length-1],dp[dp.length-2]);
//         }
        
                
        if(nums.length==1){
            return nums[0];
        }
        else{
            
            int a=nums[0];
            int b=Math.max(nums[0],nums[1]);
            
            int c=0;
            for(int i=2;i<nums.length;i++){

                c=Math.max(b,a+nums[i]);
                
                a=b;
                b=c;
            }

            return Math.max(b,a);
        }
    }
}