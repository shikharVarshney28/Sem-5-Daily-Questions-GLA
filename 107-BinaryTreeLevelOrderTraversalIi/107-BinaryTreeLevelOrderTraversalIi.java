// Last updated: 8/7/2025, 2:59:13 PM
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
                temp.add(qu.peek().val);
                if(qu.peek().left!=null) qu.add(qu.peek().left);
                if(qu.peek().right!=null) qu.add(qu.peek().right);
                qu.remove();
            }
            ans.addFirst(temp);
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        LOT(root,ans);
        return ans;
    }
}