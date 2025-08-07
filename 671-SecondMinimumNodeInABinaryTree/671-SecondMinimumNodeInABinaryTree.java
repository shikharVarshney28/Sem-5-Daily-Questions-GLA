// Last updated: 8/7/2025, 2:54:11 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 */
class Solution {
    int fmin(HashSet<Integer> hSet) {
        if(hSet.size ()==1) return -1;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        boolean f = false;
        for (int n : hSet) {
            if (n < a) {
                b = a;
                a = n;
                f=true;
            } else if (b > n) {
                b = n;
                f=true;
            }
        }
        return b;
    }

    HashSet<Integer> hSet;

    void find(TreeNode root) {
        if (root == null)
            return;
        hSet.add(root.val);
        find(root.left);
        find(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        hSet = new HashSet<>();
        find(root);
        //System.out.println (hSet);
        return fmin(hSet);
    }
}
