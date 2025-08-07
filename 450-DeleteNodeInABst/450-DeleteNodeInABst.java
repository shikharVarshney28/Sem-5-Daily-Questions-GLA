// Last updated: 8/7/2025, 2:55:26 PM
class Solution {
    int findg(TreeNode root){
        if(root.right==null) return root.val;
        return findg(root.right);
    }
    TreeNode find(TreeNode root, int d) {
        if (root == null)
            return null;
        if (root.val == d) {
            if (root.left == null && root.right == null)
                return null;
            if (root.left != null && root.right == null)
                return root.left;
            if (root.left == null && root.right != null)
                return root.right;
            int val = findg(root.left);
            root.val = val;
            root.left = find(root.left,val);
            return root;
        }
        if (root.val < d) {
            root.right = find(root.right, d);
        }
        if (root.val > d) {
            root.left = find(root.left, d);
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        
        return find(root, key);
    }
}