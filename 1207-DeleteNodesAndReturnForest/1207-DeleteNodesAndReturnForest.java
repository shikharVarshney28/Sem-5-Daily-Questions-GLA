// Last updated: 8/7/2025, 2:52:06 PM
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
    TreeNode deletion(TreeNode root,HashSet<Integer>h,List<TreeNode> forest){
        if(root==null) return root;
        root.left=deletion(root.left,h,forest);
        root.right=deletion(root.right,h,forest);
        if(!h.contains(root.val)) return root;
        //delete this node but check whether it has a child...?
        if(root.left!=null) forest.add(root.left);
        if(root.right!=null) forest.add(root.right);
        return null;     //To delete the node...
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
       for(int i:to_delete) h.add(i);
       root=deletion(root,h,ans);
       if(root!=null)  // Means root is also an answer;
            ans.add(root);

        return ans;
    }
}