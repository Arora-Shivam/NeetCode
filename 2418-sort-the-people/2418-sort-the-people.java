class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer,String> sortedHeights=new TreeMap<>();
        
        for(int i=0;i<names.length;i++){
            
          
                sortedHeights.put(heights[i],names[i]);
            
        }
        
        String[] sortedNames=new String[names.length];
        int k=sortedNames.length-1;
        for(Map.Entry<Integer,String> e : sortedHeights.entrySet()){
            // System.out.println(e);
            sortedNames[k]=e.getValue();
            k--;
        }
        
        // System.out.println(sortedHeights.values());
       
        return sortedNames;
    }
}