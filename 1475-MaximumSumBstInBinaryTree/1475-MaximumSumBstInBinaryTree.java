// Last updated: 8/20/2025, 10:59:44 AM
class Solution {
    int ans = 0;

    class Pair {
        int leftMax = Integer.MIN_VALUE;
        int rightMin = Integer.MAX_VALUE;
        int sum = 0;
    }

    Pair find(TreeNode root) {
        if (root == null) {
            return new Pair();
        }

        Pair left = find(root.left);
        Pair right = find(root.right);
        Pair p = new Pair();
        if (left.leftMax < root.val && root.val < right.rightMin) {

            p.sum = left.sum + right.sum + root.val;
            ans = Math.max(ans, p.sum);
            p.leftMax = Math.max(root.val, Math.max(left.leftMax, right.leftMax));
            p.rightMin = Math.min(root.val, Math.min(left.rightMin, right.rightMin));
            return p;
        }
        p.sum = Math.max(left.sum, right.sum);
        p.leftMax = Integer.MAX_VALUE;
        p.rightMin = Integer.MIN_VALUE;
        return p;

    }

    public int maxSumBST(TreeNode root) {
        Pair p = find(root);
        return ans;
    }
}