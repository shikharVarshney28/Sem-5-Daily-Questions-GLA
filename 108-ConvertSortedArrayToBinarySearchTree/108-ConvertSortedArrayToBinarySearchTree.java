// Last updated: 8/7/2025, 2:59:12 PM
class Solution {
    TreeNode create(int nums[], int st, int end) {
        if (st > end)
            return null;
        if (st == end)
            return new TreeNode(nums[st]);
        int mid = (st + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = create(nums, st, mid - 1);
        root.right = create(nums, mid + 1, end);
        return root;

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length - 1);
    }
}