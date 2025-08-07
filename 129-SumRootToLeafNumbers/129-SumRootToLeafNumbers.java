// Last updated: 8/7/2025, 2:58:50 PM
class Solution {
    int sum=0;
    void find(TreeNode root,int num){
        if(root == null){
            //if we add gthe statment numb 9 so it add num twice in case of leaf node
            return;
        }
        if(root.left==null && root.right == null){
            sum+=(num*10+root.val);
            return;
        }
        find(root.left,num*10+root.val);
        find(root.right,num*10+root.val);
    }
    public int sumNumbers(TreeNode root) {
        find(root,0);
        return sum;
    }
}