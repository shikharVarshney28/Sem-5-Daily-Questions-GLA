// Last updated: 8/7/2025, 2:57:11 PM
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;
        TreeNode inLeft = lowestCommonAncestor(root.left, p, q);
        TreeNode inRight = lowestCommonAncestor(root.right, p, q);
        if (inLeft != null && inRight != null) {
            return root;
        } else if (inLeft == null) {
            return inRight;
        } else {
            return inLeft;
        }
    }
}