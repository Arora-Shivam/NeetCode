class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        return longestCommonSubsequence(text1,text2,0,0,dp);
    }
    
    public int longestCommonSubsequence(String str1, String str2,int i,int j,int[][] dp) {
        
        if(str1.length()==0 || str2.length()==0 || i>=str1.length() || j>=str2.length()){
            return 0;
        }
        else if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else if(str1.charAt(i)==str2.charAt(j)){
            dp[i][j]= 1+longestCommonSubsequence(str1,str2,i+1,j+1,dp);
        }
        else{
            dp[i][j]= Math.max(longestCommonSubsequence(str1,str2,i+1,j,dp),longestCommonSubsequence(str1,str2,i,j+1,dp));
        }
        return dp[i][j];
    }
}