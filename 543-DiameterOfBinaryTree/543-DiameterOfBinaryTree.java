// Last updated: 8/7/2025, 2:54:42 PM
class Solution {
    //optiminzation without height calculation
    // int heightOfTree(TreeNode root) { // the max dist bwteen root and leaf
    //     if (root == null)
    //         return -1;
    //     return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    // }
    public int[] diameter(TreeNode root) {
        if (root == null)
            return new int[] { 0, -1 }; // diameter,height
        int leftArray[] = diameter(root.left);
        int rightArray[] = diameter(root.right);
        int selfDia = leftArray[1] + rightArray[1] + 2; // leftHeight + rightHeight + 2(root + left + right)
        int maxDiameterTillYet = Math.max(leftArray[0], Math.max(rightArray[0], selfDia));
        int heightofTree = Math.max(leftArray[1], rightArray[1]) + 1;
        return new int[] { maxDiameterTillYet, heightofTree };
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root)[0];
    }
}