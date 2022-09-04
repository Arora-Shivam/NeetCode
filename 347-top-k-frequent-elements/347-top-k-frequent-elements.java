class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        
        //for( let i of nums)
        for(int i : nums){
            
            //if(obj[i]===undefined)
            if(map.get(i)==null){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
            
        }
        
         Comparator<Map.Entry<Integer,Integer>> comp=((e1,e2)-> e1.getValue()> e2.getValue() ? -1:1);
        
         
        Set<Map.Entry<Integer,Integer>> sortedSet=new TreeSet<>(comp);
        
        sortedSet.addAll(map.entrySet());
        int[] arr=new int[k];
        int j=0;
        //System.out.println(sortedSet);
        for(Map.Entry<Integer,Integer> e : sortedSet){
            
            arr[j]=e.getKey();
            j++;
            if(j==k){
                break;
            }
        }
        
        return arr; 
    }
}