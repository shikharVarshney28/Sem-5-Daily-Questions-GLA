// Last updated: 8/7/2025, 2:53:46 PM
class Solution {
    List<Integer>ans;
    void find(Node root){
        if(root == null) return;
     ans.add(root.val);
        for(Node r : root.children){
            find(r);
        }
    }
    public List<Integer> preorder(Node root) {
        ans=new ArrayList <>();
        find(root);
        return ans;
    }
}