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
    int count=0;
    int pad=0;
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(pad<count){
            pad=count;
        }
        if(root==null){
            return 0;
        }
        
        count=2+height(root.left)+height(root.right);
        
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        
        return pad;
    }
}