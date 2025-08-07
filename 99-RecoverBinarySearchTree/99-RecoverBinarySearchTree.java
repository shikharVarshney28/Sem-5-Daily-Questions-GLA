// Last updated: 8/7/2025, 2:59:24 PM
class Solution {
    List<TreeNode> ori;
    List<TreeNode> given;

    void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        ori.add(root);
        given.add(root);
        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {
        ori = new ArrayList<>();
        given = new ArrayList<>();
        inorder(root);
        //Now Sort
        Collections.sort(ori, new Comparator<TreeNode>() {
            public int compare(TreeNode a, TreeNode b) {
                if(a.val < b.val) return -1;
                return 1;
            }
        });
        
        for (int i = 0; i < ori.size(); i++) {
            if (ori.get(i).val != given.get(i).val) {
                int temp = ori.get(i).val;
                ori.get(i).val = given.get(i).val;
                given.get(i).val = temp;
                break;
            }
        }
    }
}