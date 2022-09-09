class Solution {
    public String longestPalindrome(String s) {
        
        boolean[][] dp=new boolean[s.length()][s.length()];
        
        String res="";
        
        for(int g=0;g<s.length();g++){
            int i=0;
            for(int j=g;j<s.length() && i<s.length();j++){
                // System.out.println(i +" " +j);
                 if(i==j){
                    dp[i][j]=true;
                    res=s.substring(i,j+1);
                }
                else if(j-i==1){
                    
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                    if(dp[i][j])
                    res=s.substring(i,j+1);
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        res=s.substring(i,j+1);
                    }    
                }
                i++;
                // if(i==0 && j==2){
                //     System.out.println(s.charAt(i)+" "+s.charAt(j) +" " +dp[i+1][j-1]);
                // }
            }
            
        }
        // for(boolean[] i : dp)
        //    System.out.println(Arrays.toString(i));
        return res;
    }
    
   
}