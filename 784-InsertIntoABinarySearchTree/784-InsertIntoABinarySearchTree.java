// Last updated: 8/7/2025, 2:53:40 PM
class Solution {
    TreeNode find(TreeNode root,int val){
        if(root == null) return new TreeNode(val);
        if(val < root.val) root.left = find(root.left,val);
        else  root.right = find(root.right,val);
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return find(root,val);
    }
}