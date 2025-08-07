// Last updated: 8/7/2025, 2:59:15 PM
class Solution {
    HashMap<Integer, Integer> hmap;

    TreeNode find(int[] i, int[] p, int st, int end, int pst) {
        if (st == end)
            return new TreeNode(i[st]);
        if (st > end)
            return null;
        int pos = hmap.get(p[pst]);
        TreeNode root = new TreeNode(p[pst]);
        //ystem.out.println (root.val);
        root.left = find(i, p, st, pos - 1, pst + 1);
        root.right = find(i, p, pos + 1, end, pst + pos - st + 1);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        hmap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hmap.put(inorder[i], i);
        }
        TreeNode root = null;
        return find(inorder, preorder, 0, inorder.length - 1, 0);
    }
}