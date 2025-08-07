// Last updated: 8/7/2025, 2:58:55 PM
class Solution {
    long ans = Integer.MIN_VALUE;

    long find(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        if (root.left == null && root.right == null)
            return root.val;
        long left = find(root.left);
        long right = find(root.right);
        ans = Math.max(left + right + root.val, ans);
        // System.out.println (root.val+" "+left+" "+right+" "+ans);
        long max = Math.max(left, right);
        //check whether till this node we have max path before adding its val..
        ans = Math.max(max, ans);
        //Its not compulsory to have leaf node val in our ans...
        return Math.max(max + root.val, root.val);
    }

    public int maxPathSum(TreeNode root) {
        long get = find(root);
        return (int) Math.max(ans, get);
    }
}