class Solution {
    public int numDecodings(String s) {
        
        Integer[] arr= Arrays.stream(s.split("")).map( Integer :: parseInt).toArray(Integer[] :: new);
        
        int[] dp=new int[arr.length+1];
        dp[0]=1;
        
        if(arr.length==0 || arr[0]==0){
            return 0;
        }
        else
            dp[1]=1;
        
        if(arr.length==1){
            return 1;
        }
        
        for(int i=2;i<dp.length;i++){
           if(arr[i-1]==0 && arr[i-2]==0){
               return 0;
           } 
           else if(arr[i-1]==0 ){
               if(arr[i-2]>=3){
                   return 0;
               }
               dp[i]+=dp[i-2];
           }
           else if(arr[i-2]==0){
               dp[i]+=dp[i-1];
           }
           else if(arr[i-2]==1 || arr[i-2]==2 && arr[i-1]<=6){
               dp[i]+=dp[i-1]+dp[i-2];
           } 
           else if(arr[i-2]>2 || arr[i-2]==2 && arr[i-1]>=7){
               dp[i]+=dp[i-1];
           } 
            
        }
        
       System.out.println(Arrays.toString(dp));
        
        return dp[dp.length-1];
    }
}