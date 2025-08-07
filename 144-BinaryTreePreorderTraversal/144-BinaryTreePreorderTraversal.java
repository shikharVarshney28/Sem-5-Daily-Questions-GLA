// Last updated: 8/7/2025, 2:58:34 PM
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
    void preorder(TreeNode root,List<Integer> ans){
        if(root == null) return;
        //Root -----> left------->Right
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
}