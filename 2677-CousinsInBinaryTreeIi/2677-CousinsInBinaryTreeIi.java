// Last updated: 8/7/2025, 2:46:35 PM
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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        ArrayList<Integer> levelSum=new ArrayList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size(),sum=0;
            for(int i=0;i<size;i++){
                TreeNode temp=qu.poll();
                if(temp.left!=null) qu.add(temp.left);
                if(temp.right!=null) qu.add(temp.right);
                sum+=temp.val;
            }
            levelSum.add(sum);
        }
        //now updating val...
        //System.out.print(levelSum);
        int idx=1;
        root.val=0;
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            for(int i=0;i<size;i++){
                int childSum=0;
                TreeNode temp=qu.poll();
                if(temp.left!=null) childSum+=temp.left.val;
                if(temp.right!=null) childSum+=temp.right.val;
                if(temp.left!=null){
                    temp.left.val = levelSum.get(idx)-childSum;
                    qu.add(temp.left);
                }
                if(temp.right!=null){
                    temp.right.val = levelSum.get(idx)-childSum;
                   // System.out.println(temp.right.val);
                    qu.add(temp.right);
                }
                
            }
            idx++;
            
        }
        return root;

    }
}