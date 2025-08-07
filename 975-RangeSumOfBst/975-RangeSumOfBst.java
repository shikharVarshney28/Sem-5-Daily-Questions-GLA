// Last updated: 8/7/2025, 2:52:46 PM
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
    void Sum(TreeNode root,int low,int high)
    {
        if(root==null) return;
        if(root.val>=low && root.val<=high) count+=root.val;
        Sum(root.right,low,high);
        Sum(root.left,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Sum(root,low,high);

        return count;
    }
}