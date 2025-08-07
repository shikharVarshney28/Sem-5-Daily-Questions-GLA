// Last updated: 8/7/2025, 2:53:50 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    void LOT(Node root, List<List<Integer>> ans) {
        Queue<Node> qu = new LinkedList<>();
        if(root!=null)
        qu.add(root);
        while (!qu.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                Node root2 = qu.poll();
                temp.add(root2.val);
                // add n childer
                for (Node child : root2.children) {
                    if (child != null)
                        qu.add(child);
                }
            }
            ans.add(temp);
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        LOT(root, ans);
        return ans;
    }
}