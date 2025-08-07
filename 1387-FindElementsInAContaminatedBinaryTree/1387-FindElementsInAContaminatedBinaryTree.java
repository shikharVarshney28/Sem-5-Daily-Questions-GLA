// Last updated: 8/7/2025, 2:51:36 PM
class FindElements {
    HashSet<Integer> hSet = new HashSet<>();

    void find(TreeNode root, int add, int parent) {
        if (root == null)
            return;
        root.val = 2 * parent + add;
        hSet.add(root.val);
        find(root.left, 1, root.val);
        find(root.right, 2, root.val);
    }

    public FindElements(TreeNode root) {
        root.val = 0;
        find(root, 0, 0);
    }

    public boolean find(int target) {
        return hSet.contains(target);
    }
}