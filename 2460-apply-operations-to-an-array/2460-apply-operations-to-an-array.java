class Solution {
    public int[] applyOperations(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        shiftZeros(nums);
        return nums;
    }
    
    public void shiftZeros(int[] arr){
        
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
    }
}