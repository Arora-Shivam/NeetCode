/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer,List<Integer>> map=new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        return levelOrder(root,0);
    }
    
     public List<List<Integer>> levelOrder(TreeNode root,int level) {
        
         if(root==null){
             return new ArrayList<>();
         }
         if(map.get(level)==null){
             List<Integer> list=new ArrayList<>();
             list.add(root.val);
             map.put(level,list);
         }
         else{
             map.get(level).add(root.val);
         }
         levelOrder(root.left,level+1);
         levelOrder(root.right,level+1);
        
         return new ArrayList<>(map.values());
    }
}