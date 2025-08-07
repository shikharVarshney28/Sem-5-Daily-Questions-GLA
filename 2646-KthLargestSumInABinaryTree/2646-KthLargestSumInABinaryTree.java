// Last updated: 8/7/2025, 2:46:40 PM
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> qu=new LinkedList<>();
        if(root!=null) qu.add(root);
        ArrayList<Long> arr=new ArrayList<>();
        while(qu.size()!=0){
            Long sum=0l;
            int s=qu.size();
            for(int i=0;i<s;i++){
           TreeNode temp= qu.poll();
           if(temp.left!=null) qu.add(temp.left);
           if(temp.right!=null) qu.add(temp.right);
           sum+=temp.val;
            }
            arr.add(sum);
        }
        Collections.sort(arr);
        return arr.size()>=k ? arr.get(arr.size()-k) : -1;








    }
}