/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        else if(node.neighbors.size()==0){
            Node clonedNode=new Node(node.val);
            return clonedNode;
        }
        else{
            Map<Node,Node> map=new HashMap<>();
            return dfs(node,map);
        }
        
    }
    
    public Node dfs(Node node,Map<Node,Node> map){
        
        if(node==null){
            return null;
        }
      
        Node clonedNode=null;
        
        if(!map.containsKey(node)){
             clonedNode=new Node(node.val);
             map.put(node,clonedNode);
        }
        else{
            clonedNode=map.get(node);
            return clonedNode;
        }
        
        for(Node n : node.neighbors){
            
            if(!map.containsKey(n)){
                
                Node newNode=dfs(n,map);
                
                clonedNode.neighbors.add(newNode);
            }
            else{
                
                clonedNode.neighbors.add(map.get(n));
            }
        }
        
        return clonedNode;
    }
}