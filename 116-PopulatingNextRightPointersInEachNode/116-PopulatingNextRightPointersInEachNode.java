// Last updated: 8/7/2025, 2:59:02 PM
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
        Queue<Node> qu=new LinkedList <>();
        qu.add (root);
        while(qu.size ()!=0){
            int size =qu.size ();
            //List<Node>arr=new ArrayList<>();
            Node temp=null;
            while(size-->0){
                temp=qu.poll ();
                if(size!=0) temp.next=qu.peek();
                if(temp.left!=null) qu.add (temp.left);
                if(temp.right!=null) qu.add (temp.right);
            }
            temp.next=null;
        }
        return root;
    }
}












