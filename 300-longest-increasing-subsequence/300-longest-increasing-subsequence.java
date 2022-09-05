class Solution {
    
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        // Arrays.fill(dp,1);
        
        int x= lengthOfLIS(nums,dp);
        
        return x;
    }
 
      public int lowerBound(int[] arr, int k,int j){
          
          
          int i=0;
          
          int res=-1;
          
          while(i<j){
              int mid=(i+j)/2;
              
              if(k>arr[mid]){
                  res=mid;
                  i++;
              }
              else{
                  j--;
              }
          }
          return res;
      }
      public int lengthOfLIS(int[] nums,int[] dp){
          
          int j=0;
          for(int i : nums){
              if(j==0){
                  dp[j]=i;
                  j++;
              }
              else if(j!=0 && dp[j-1]<i){
                  dp[j++]=i;
              }
              else{
               
                  dp[lowerBound(dp,i,j-1)+1]=i;
              }
      
          }
          return j;
      } 
}