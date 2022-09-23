class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
       // StringBuilder sb=new StringBuilder("");
        String str="";
        
        for(String st : words){
            
            str+=st;
            if(str.equals(s)){
                return true;
            }
            if(str.length()>s.length()){
                return false;
            }
        }
        
        return false;
    }
}