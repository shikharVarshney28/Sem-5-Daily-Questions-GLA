// Last updated: 8/7/2025, 2:55:00 PM
class Solution {
    int ans=0,maxDepth=-1 ;
    void find(TreeNode root,int depth){
        if(root ==null) return;
        if(depth>maxDepth){
            maxDepth =depth;
            ans=root.val;

        }
        find(root.left,depth+1);
        find(root.right,depth+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        find(root,0);
        return ans;
    }
}