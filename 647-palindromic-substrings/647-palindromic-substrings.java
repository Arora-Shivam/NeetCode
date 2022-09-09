class Solution {
    public int countSubstrings(String s) {
        
        boolean[][] arr=new boolean[s.length()][s.length()];
        int count=0;
        for(int g=0;g<s.length();g++){
            
            int i=0;
            for(int j=g;j<s.length() && i<s.length();j++){
                if(i==j){
                    arr[i][j]=true;
                    count++;
                }
                else if(j-i==1){
                    arr[i][j]=s.charAt(i)==s.charAt(j);
                    if(arr[i][j]){
                        count++;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && arr[i+1][j-1]==true){
                        arr[i][j]=true;
                        count++;
                    }
                }
                
                i++;
            }
        }
       
        return count;
    }
}