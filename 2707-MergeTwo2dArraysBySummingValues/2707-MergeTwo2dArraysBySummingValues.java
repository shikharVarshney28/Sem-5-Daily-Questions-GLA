// Last updated: 8/7/2025, 2:46:23 PM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> arr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                arr.add(new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            } else if (nums1[i][0] > nums2[j][0]) {
                arr.add(nums2[j]);
                j++;
            } else {
                arr.add(nums1[i]);
                i++;
            }
        }
        while (i < nums1.length)
            arr.add(nums1[i++]);
        while (j < nums2.length)
            arr.add(nums2[j++]);
        int ans[][] = new int[arr.size()][2];
        return arr.toArray(new int[arr.size()][]);

    }
}
