// Last updated: 8/7/2025, 2:49:58 PM
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        int level = 0;
        while (qu.size() > 0) {
            int size = qu.size();
            int inc = Integer.MIN_VALUE, desc = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode temp = qu.poll();
                if (level % 2 == 0) {
                    // even level -- increasing odd num
                    if (temp.val % 2 == 0 || inc >= temp.val)
                        return false;
                    inc = temp.val;
                } else {
                    // odd level--- descresing even val
                    if (temp.val % 2 != 0 || desc <= temp.val)
                        return false;
                    desc = temp.val;
                }
                if (temp.left != null)
                    qu.add(temp.left);
                if (temp.right != null)
                    qu.add(temp.right);
            }
            level++;
        }
        return true;
    }
}