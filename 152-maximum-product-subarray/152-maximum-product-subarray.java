class Solution {
    
    public int maxProduct(int[] nums) {
        
        // int[][] dp=new int[nums.length][2];  
        // dp[0][0]=nums[0];
        // dp[0][1]=nums[0];
        int currMax=nums[0];
        int currMin=nums[0];
        int PrevMin=nums[0];
        int PrevMax=nums[0];
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]==0){
                currMax=1;
                currMin=1;
                max=Math.max(max,0);
            }
            else{
                currMax=Math.max(PrevMax*nums[i],Math.max(PrevMin*nums[i],nums[i]));
                currMin=Math.min(PrevMax*nums[i],Math.min(PrevMin*nums[i],nums[i]));
                max=Math.max(max,Math.max(currMax,currMin));
            }
            PrevMin=currMin;
            PrevMax=currMax;
        }
        // for(int[] d : dp){
        //     System.out.println(Arrays.toString(d));
        // }     
        
        return max;
    }
    
  
}