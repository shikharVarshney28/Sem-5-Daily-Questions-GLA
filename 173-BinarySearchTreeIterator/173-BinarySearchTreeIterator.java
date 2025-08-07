// Last updated: 8/7/2025, 2:57:53 PM
class BSTIterator {
    
    List<Integer>ans;
    void find(TreeNode root,List<Integer>ans){
        if(root==null) return;
        find(root.left,ans);
        ans.add(root.val);
        find(root.right,ans);
    }
    int idx=-1;
    public BSTIterator(TreeNode root) {
        ans=new ArrayList<>();
        find(root,ans);
    }
    
    public int next() {
        idx++;
        return ans.get(idx);
    }
    
    public boolean hasNext() {
        return idx<ans.size()-1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */