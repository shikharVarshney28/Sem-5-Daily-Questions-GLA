// Last updated: 8/7/2025, 2:52:18 PM
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
    int num=0;
    
    void GST(TreeNode root,List<Integer>a)
    {
        //inorder traversal
        if(root==null) return;
        GST(root.right,a);
        root.val+=num;
        num=root.val;
        GST(root.left,a);


    }
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return null;
        List<Integer>a=new ArrayList<>();
        // inorder(root,a);
        // updation(a);
        // System.out.println(a);
        GST(root,a);
        return root;
    }
}