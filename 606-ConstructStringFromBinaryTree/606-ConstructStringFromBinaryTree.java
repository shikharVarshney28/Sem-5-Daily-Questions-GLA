// Last updated: 8/7/2025, 2:54:24 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode 
 * }
 */
class Solution {
    String find(TreeNode root){
        if(root==null) return "";
        if(root.left == null && root.right==null) return ""+root.val;
        String l = find(root.left);
        if(root.right == null) return root.val +"(" + l+")";
        String r= find(root.right);
        return root.val +"("+l+")"+"("+r+")";
    }
    public String tree2str(TreeNode root) {
        return find(root);
    }
}