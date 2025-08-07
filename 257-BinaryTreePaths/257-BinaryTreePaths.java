// Last updated: 8/7/2025, 2:56:55 PM
class Solution {
    List<String> ans = new ArrayList<>();

    void traversal(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            String path = s.toString() + root.val;
            ans.add(path);
            return;
        }
        traversal(root.left, s + root.val + "->");
        traversal(root.right, s + root.val + "->");
    }

    public List<String> binaryTreePaths(TreeNode root) {
        traversal(root, "");
        return ans;
    }
}