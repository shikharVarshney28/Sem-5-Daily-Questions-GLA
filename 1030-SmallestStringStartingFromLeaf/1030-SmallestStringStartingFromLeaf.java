// Last updated: 8/7/2025, 2:52:35 PM
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
    String ans="";
    void form(TreeNode root,StringBuilder s){
        if(root==null) return;
        if(root.left ==null && root.right ==null){
            s.insert(0,(char)(root.val +'a'));
            if(ans.equals("")) ans=""+s;
            else if(ans.compareTo(""+s)>0) ans=""+s;
            //System.out.println (ans);
            s.deleteCharAt (0);
            return;
        }
        form(root.left,s.insert(0,(char)(root.val+'a')));
        s.deleteCharAt(0);
        form(root.right,s.insert(0,(char)(root.val +'a')));
        s.deleteCharAt(0);
    }
    public String smallestFromLeaf(TreeNode root) {
        form(root,new StringBuilder());
        return ans;
    }
}