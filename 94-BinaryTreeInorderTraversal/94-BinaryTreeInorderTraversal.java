// Last updated: 8/7/2025, 2:59:28 PM
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
    void inorder(TreeNode root,List<Integer> ans)
    {
       // Inorder  Left ---> root ------> Right
       //Base Case
       if(root==null){
        return;
       }
       inorder(root.left,ans);
       ans.add(root.val); 
       inorder(root.right,ans);
       
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
}