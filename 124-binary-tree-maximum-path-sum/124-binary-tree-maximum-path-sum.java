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
    int pad=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        maxPathSum2(root);
        return pad;
    }
    public int maxPathSum2(TreeNode root) {
     
        if(root==null){
            return 0;
        }
       
        
        int y=Math.max(0,maxPathSum2(root.left));
        int z=Math.max(0,maxPathSum2(root.right));
        int x= Math.max(y,z);
    
        pad=Math.max(pad,Math.max(root.val,Math.max(y+z+root.val,Math.max(root.val+y,
                                                                          Math.max(root.val+x,root.val+z)))));
        
        
        
        return root.val+Math.max(x,y);
    }
}