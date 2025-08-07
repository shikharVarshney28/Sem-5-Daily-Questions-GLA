// Last updated: 8/7/2025, 2:59:16 PM
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
    int d=0;
    int MaxDepth(TreeNode root)
    {
        if(root==null) return 0;
        int LeftDia=MaxDepth(root.left);
        int RightDia=MaxDepth(root.right);
        d=Math.max(d,LeftDia+RightDia+1);
        return Math.max(LeftDia,RightDia)+1; 
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return d;
        return MaxDepth(root);
        
    }
}