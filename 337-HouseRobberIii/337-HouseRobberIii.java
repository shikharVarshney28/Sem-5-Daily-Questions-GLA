// Last updated: 8/7/2025, 2:56:19 PM
class Solution {
    HashMap<TreeNode,Integer> hmap=new HashMap <>();
    int find(TreeNode root){
        if(root==null) return 0;
        //if the root val is including
        if(hmap.containsKey (root)) return hmap.get(root);
        int chosen =root.val;
        if(root.left!=null) {
            chosen += find(root.left.left);
        chosen+=find(root.left.right);
        }
        if(root.right!=null){
            chosen+= find(root.right.right);
            chosen+=find(root.right.left);
        }
        //not chosen
        int notChosen = find(root.left)+find(root.right);
        int value = Math.max (chosen,notChosen);
        hmap.put(root,value);
        return value;
    }
    public int rob(TreeNode root) {
        return find(root);
    }
}