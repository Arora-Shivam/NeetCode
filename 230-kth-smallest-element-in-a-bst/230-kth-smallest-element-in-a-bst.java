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
    int count =0;
    int pad=0;
    public int kthSmallest(TreeNode root, int k) {
     
       
        if(root==null){
            count++;
            return -1;
        }
        
        kthSmallest(root.left,k);
        if(count==k){
            pad=root.val;
            count++;
            return pad;    
        }       
        kthSmallest(root.right,k);
   
        
        return pad;
    }
}