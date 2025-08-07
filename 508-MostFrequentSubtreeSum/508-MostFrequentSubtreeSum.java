// Last updated: 8/7/2025, 2:55:02 PM
class Solution {
    int maxCount = -1;

    HashMap<Integer, Integer> hmap;

    int find(TreeNode root) {
        if (root == null)
            return 0;
        int left = find(root.left);
        int right = find(root.right);
        int sumOfSubTree = root.val + left + right;
        hmap.put(sumOfSubTree, hmap.getOrDefault(sumOfSubTree, 0) + 1);
        maxCount = Math.max(maxCount, hmap.get(sumOfSubTree));
        return sumOfSubTree;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        hmap = new HashMap<>();
        find(root);
        //System.out.println (hmap);
        int count = 0;
        for (int i : hmap.keySet()) {
            if (hmap.get(i) == maxCount)
                count++;
        }
        //System.out.println (count);
        int ans[] = new int[count];
        int idx = 0;
        for (int i : hmap.keySet()) {
            if (hmap.get(i) == maxCount)
                ans[idx++] = i;
        }
        return ans;
    }
}