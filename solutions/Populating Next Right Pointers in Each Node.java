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
        if(root==null)
            return null;
        Node pre=root;
        Node current=null;
        while(pre.left!=null){
            current=pre;
            while(current!=null){
                current.left.next=current.right;
                if(current.next!=null&&current.right!=null){
                    current.right.next=current.next.left;
                }
                current=current.next;
            }
            pre=pre.left;
        }
        return root;
    }
}
