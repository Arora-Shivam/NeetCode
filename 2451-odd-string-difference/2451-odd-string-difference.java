class Solution {
    public String oddString(String[] words) {
        Map<List<Integer>,List<String>> map=new HashMap<>();
        
      
        
        for(String w : words){
            
            List<Integer> difference=new ArrayList<>();
            for(int i=0;i<w.length()-1;i++){
                int diff=w.charAt(i+1)-w.charAt(i);
                difference.add(diff);
            }
            
            if(map.get(difference)==null){
                List<String> stringList=new ArrayList<>();
                stringList.add(w);
                map.put(difference,stringList);
            }
            else{
                map.get(difference).add(w);
            }
    }
        
        for(Map.Entry<List<Integer>,List<String>> e : map.entrySet()){
            
            if(e.getValue().size()==1){
                System.out.println(e);
                return e.getValue().get(0);
            }
        }
        return "";
}
}