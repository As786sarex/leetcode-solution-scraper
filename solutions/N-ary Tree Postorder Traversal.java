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
    List<Integer> l;
    public List<Integer> postorder(Node root) {
        l=new ArrayList<>();
        postOrderRecursive(root);
        return l;
    }
    
    private void postOrderRecursive(Node n){
        if(n==null){
            return;
        }
        else{
            if(n.children!=null){
            for(Node x:n.children){
                postOrderRecursive(x);      
            }
           }
           l.add(n.val);
        }
    }
}
