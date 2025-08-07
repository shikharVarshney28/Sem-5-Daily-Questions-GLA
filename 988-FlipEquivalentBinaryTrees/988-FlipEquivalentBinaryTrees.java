// Last updated: 8/7/2025, 2:52:41 PM
class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        boolean isTreeMirror = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        boolean isTreeSystremic = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        return isTreeMirror || isTreeSystremic;
    }
}