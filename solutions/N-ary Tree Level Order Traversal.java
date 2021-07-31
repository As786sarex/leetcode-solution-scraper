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
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        q.add(root);q.add(null);
        List<Integer> l=new ArrayList<>();
        while(!q.isEmpty()){
            Node n=q.poll();
            if(n==null){
                if(!q.isEmpty())
                    q.add(null);
                list.add(l);
                l=new ArrayList<>();
            }
            else{
                l.add(n.val);
                for(Node x:n.children)
                    q.add(x);
                
            }
        }
        return list;
    }
}
