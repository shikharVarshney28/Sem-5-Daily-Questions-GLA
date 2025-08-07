// Last updated: 8/7/2025, 2:57:45 PM
class Solution {
    int maxDepth = 0;
    List<Integer> ans=new ArrayList<>();
    void find(TreeNode root,int currDepth){
        if(root == null) return;
        if(maxDepth < currDepth){
            ans.add(root.val);
            maxDepth = currDepth;
        }
        find(root.right,currDepth+1);
        find(root.left,currDepth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        find(root,1);
        return ans;
    }
}