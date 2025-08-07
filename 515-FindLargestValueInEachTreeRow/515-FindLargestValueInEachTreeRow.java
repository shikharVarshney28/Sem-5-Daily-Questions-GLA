// Last updated: 8/7/2025, 2:54:59 PM
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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode >qu=new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList <>();
        qu.add (root);
        while(qu.size ()>0){
            int size=qu.size ();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp=qu.poll ();
                max=Math.max (max,temp.val);
                if(temp.left!=null) qu.add (temp.left);
                if(temp.right!=null) qu.add (temp.right);
            }
            ans.add (max);
        }
        return ans;
    }
}