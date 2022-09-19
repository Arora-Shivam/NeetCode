class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
     
        //         if(str.length()>s.length()){
//             return false;
//         }
//         else if(str.length()==s.length()){
//             return str.equals(s);
//         }
//         else if(str.length()!=0 && str.charAt(0)!=s.charAt(0)){
//             return false;
//         }
//          else if(str.substring(0,str.length()).equals(str)==false){
//             return false;
//         }
//         boolean res=false;
//         for(String s1 : wordDict){
//             res=res || wordBreak(s,wordDict,str+s1);
//         }
//         return res;
        
        Set<String> set=new HashSet<>();
        
        for(String st : wordDict){
            set.add(st);
        }
        
        boolean[] dp=new boolean[s.length()+1];
        
        dp[0]=true;
        
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }
        //System.out.println(Arrays.toString(dp));
        return dp[dp.length-1];
    }
    
   
}