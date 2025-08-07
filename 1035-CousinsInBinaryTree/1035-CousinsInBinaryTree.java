// Last updated: 8/7/2025, 2:52:32 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    class Pair {
        TreeNode root;
        int parent;

        Pair(TreeNode root, int parent) {
            this.root = root;
            this.parent = parent;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(root, -1));
        int px = -1, py = -1;
        while (qu.size() > 0) {
            int size = qu.size();
            boolean fx = false, fy = false;
            for (int i = 0; i < size; i++) {
                Pair pair = qu.poll();
                if (pair.root.val == x) {
                    fx = true;
                    px = pair.parent;
                }
                if (pair.root.val == y) {
                    fy = true;
                    py = pair.parent;
                }
                if (fy && fx)
                    return py != px;
                if (pair.root.left != null)
                    qu.add(new Pair(pair.root.left, pair.root.val));
                if (pair.root.right != null)
                    qu.add(new Pair(pair.root.right, pair.root.val));
            }
            if (fx || fy)
                return false;
        }
        return false;
    }
}