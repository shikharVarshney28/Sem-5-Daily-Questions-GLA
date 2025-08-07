// Last updated: 8/7/2025, 2:59:01 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while (qu.size() > 0) {
            int size = qu.size();
            for (int i = 1; i <= size; i++) {
                Node t = qu.poll();
                if (i != size)
                    t.next = qu.peek();
                else
                    t.next = null;

                if (t.left != null)
                    qu.add(t.left);
                if (t.right != null)
                    qu.add(t.right);
            }
        }
        return root;
    }
}