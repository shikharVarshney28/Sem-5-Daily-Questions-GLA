// Last updated: 8/7/2025, 2:53:47 PM
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
    int find(Node root) {
        if (root == null)
            return 0;
        int max = 0;
        for (Node r : root.children) {
            max = Math.max(max, find(r));
        }
        return max + 1;
    }

    public int maxDepth(Node root) {
        return find(root);
    }
}