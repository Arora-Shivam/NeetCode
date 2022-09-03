class Solution {
    public int rob(int[] nums) {

        
                
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