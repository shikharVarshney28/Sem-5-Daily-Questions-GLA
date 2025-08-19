// Last updated: 8/19/2025, 5:04:10 PM
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
    public void preorder(TreeNode root,List<Integer> a)
    {
        if(root==null) return;
        a.add(root.val);
        preorder(root.left,a);
        preorder(root.right,a);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a=new ArrayList<>();
        preorder(root1,a);
        preorder(root2,a);
        Collections.sort(a);
        return a;
    }
}