// Last updated: 8/7/2025, 2:54:13 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int idx=0;
    TreeNode buildTree(int [] nums,Map<Integer,Integer> tmap,int st,int end)
    {
        if(st>=end) return null;
        int max=0;
        for(int i=st;i<end;i++) max=Math.max(max,nums[i]);
        TreeNode root=new TreeNode(max);
        int idx=tmap.get(max);
        root.left=buildTree(nums,tmap,st,idx);
        root.right=buildTree(nums,tmap,idx+1,end);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Map<Integer,Integer> tmap=new TreeMap<>();
        for(int i=0;i<nums.length;i++) tmap.put(nums[i],i);
        
        return buildTree(nums,tmap,0,nums.length);
    }
}