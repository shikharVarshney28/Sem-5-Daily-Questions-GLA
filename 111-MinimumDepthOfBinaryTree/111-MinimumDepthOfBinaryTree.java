// Last updated: 8/7/2025, 2:59:09 PM
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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return Depth(root);
    }
    int Depth(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        if(root.left==null && root.right==null) return 1;
        return Math.min(Depth(root.left),Depth(root.right))+1;
    }
}