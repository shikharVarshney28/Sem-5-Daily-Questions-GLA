// Last updated: 8/7/2025, 2:59:11 PM
class Solution {
    int[] find(TreeNode root) {
        if (root == null)
            return new int[] { 0, 1 };
        int left[] = find(root.left);
        if (left[1] == -1)
            return new int[] { -1, -1 };
        int right[] = find(root.right);
        if (right[1] == -1)
            return new int[] { -1, -1 };
        if (Math.abs(left[0] - right[0]) > 1) {
            return new int[] { -1, -1 };
        }
        return new int[] { Math.max(left[0], right[0]) + 1, 1 };
    }

    public boolean isBalanced(TreeNode root) {
        return find(root)[1] == 1;
    }
}