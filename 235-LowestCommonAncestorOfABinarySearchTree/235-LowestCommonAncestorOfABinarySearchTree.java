// Last updated: 8/7/2025, 2:57:12 PM
class Solution {
    TreeNode find(TreeNode root,int p,int q){
        if(root==null) return null;
        if(p<=root.val && root.val<=q || q<=root.val && root.val<=p) return root; // divergen
        //both are small
        if(p<root.val && q<root.val) return find(root.left,p,q);
        return find(root.right,p,q);
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root,p.val,q.val);
    }
}