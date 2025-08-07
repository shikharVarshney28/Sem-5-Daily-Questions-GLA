// Last updated: 8/7/2025, 2:52:17 PM
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        int ans = 0, level = 1;
        long netSum = Long.MIN_VALUE;
        qu.add(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            //For this level we find the net sum
            long sum = 0;
            for (int i = 1; i <= size; i++) {
                TreeNode n = qu.poll();
                sum += n.val;
                if (n.left != null) {
                    qu.add(n.left);
                }
                if (n.right != null) {
                    qu.add(n.right);
                }
            }
            //System.out.println(level+" "+sum);
            if (sum > netSum) {
                ans = level;
                netSum = sum;
            }
            level++;
        }
        return ans;
    }
}