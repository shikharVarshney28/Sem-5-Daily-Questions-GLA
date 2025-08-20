// Last updated: 8/20/2025, 10:57:41 AM
class Solution {
    int c = 0;

    class Pair {
        int sum;
        int c;

        Pair(int sum, int c) {
            this.sum = sum;
            this.c = c;
        }
    }

    Pair find(TreeNode root) {
        if (root == null)
            return new Pair(0, 0);
        if (root.left == null && root.right == null) {
            c++;
            return new Pair(root.val, 1);
        }
        Pair l = find(root.left);
        Pair r = find(root.right);
        int sum = (l.sum + r.sum + root.val);
        int cnt = (l.c + r.c + 1);
        int avg = sum / cnt;
        if (root.val == avg)
            c++;
        return new Pair(sum, cnt);

    }

    public int averageOfSubtree(TreeNode root) {
        find(root);
        return c;
    }
}