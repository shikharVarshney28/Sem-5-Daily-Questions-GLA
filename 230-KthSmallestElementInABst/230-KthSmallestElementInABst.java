// Last updated: 8/7/2025, 2:57:19 PM
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
    int ans=0;
    void inorder(TreeNode root,ArrayList<Integer> ans)
    {
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans.get(k-1);
    }
}