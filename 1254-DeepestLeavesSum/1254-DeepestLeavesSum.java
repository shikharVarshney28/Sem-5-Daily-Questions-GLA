// Last updated: 8/7/2025, 2:51:58 PM
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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        int data=0;
        qu.add(root);
        while(qu.size()!=0)
        {
            int count=qu.size();
            int sum=0;
            for(int i=1;i<=count;i++)
            {
                sum+=(qu.peek().val);
                if(qu.peek().left!=null) qu.add(qu.peek().left);
                if(qu.peek().right!=null) qu.add(qu.peek().right);
                qu.remove();
                
            }
            data=sum;

        }
        return data;
    }
}