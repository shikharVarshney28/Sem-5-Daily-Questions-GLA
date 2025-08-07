// Last updated: 8/7/2025, 2:54:20 PM
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while (qu.size() > 0) {
            int size = qu.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = qu.poll();
                if (temp.left != null)
                    qu.add(temp.left);
                if (temp.right != null)
                    qu.add(temp.right);
                sum += temp.val;
            }
            ans.add((double) sum /  size);
        }
        return ans;

    }
}