class Solution {
    public int search(int[] arr, int target) {
        
        int low=0;
        int high=arr.length-1;
        int res=-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            
            if(arr[mid]==target){
                res=mid;
                return res;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
}