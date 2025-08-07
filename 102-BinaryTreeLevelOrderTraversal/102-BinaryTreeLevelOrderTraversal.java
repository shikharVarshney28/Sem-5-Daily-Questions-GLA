// Last updated: 8/7/2025, 2:59:19 PM
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
    void LOT(TreeNode root,List<List<Integer>> ans)
    {
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int count=qu.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<count;i++)
            {
                TreeNode t=qu.remove();
                temp.add(t.val);
                if(t.left!=null) qu.add(t.left);
                if(t.right!=null) qu.add(t.right);
                
            }
            ans.add(temp);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        LOT(root,ans);
        return ans;
    }
}