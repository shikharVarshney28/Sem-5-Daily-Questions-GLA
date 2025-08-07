// Last updated: 8/7/2025, 2:47:16 PM
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
    void reverse (TreeNode root){
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add (root);
        int level=0;
        while(qu.size ()!=0){
            List<TreeNode > arrList=new ArrayList <>();
            int size =qu.size();
            for(int i=1;i<=size;i++){
                TreeNode temp=qu.poll();
                arrList.add(temp);
                if(temp.left!=null) qu.add (temp.left);
                if(temp.right!=null) qu.add (temp.right);
            }
            if(level%2!=0){
                int left=0,right =(arrList.size()-1);
                while(left<right){
                    int temp=arrList.get(right).val;
                    arrList.get(right).val=arrList.get(left).val;
                    arrList.get(left).val=temp;
                    left++;
                    right--;

                }
            }
            level++;
        }
        
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse (root);
        return root;
    }
}











