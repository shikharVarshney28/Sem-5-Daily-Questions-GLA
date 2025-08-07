// Last updated: 8/7/2025, 2:52:28 PM
class Solution {
    TreeNode root = null;

    TreeNode form(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (root.val > val) {
            root.left = form(root.left, val);
        } else {
            root.right = form(root.right, val);
        }
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        for (int i : preorder) {
            root = form(root, i);
        }
        return root;
    }
}