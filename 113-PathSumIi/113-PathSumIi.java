// Last updated: 8/7/2025, 2:59:06 PM

class Solution {
    void find(TreeNode root, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (root == null)
            return;
        if (target == root.val && root.left == null && root.right == null) {
            // System.out.println (ds);
            ds.add(root.val);
            ans.add(new ArrayList<>(ds));
            ds.remove(ds.size() - 1);
            return;
        }
        ds.add(root.val);
        find(root.left, target - root.val, ans, ds);
        find(root.right, target - root.val, ans, ds);
        ds.remove(ds.size() - 1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        find(root, targetSum, ans, new ArrayList<>());
        return ans;
    }
}