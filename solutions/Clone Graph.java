/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node root) {
        if(root==null)
            return null;
        HashMap<Integer,Node> mp=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node result=null;
        while(!q.isEmpty()){
            Node node=q.poll();
            Node newNode=null;
            if(mp.containsKey(node.val))
                newNode=mp.get(node.val);
            else
                newNode=new Node(node.val);
            mp.put(newNode.val,newNode);
            if(result==null)
                result=newNode;
            for(Node neighbor:node.neighbors){
                System.out.print(neighbor.val+" ");
                if(!mp.containsKey(neighbor.val)){
                    q.add(neighbor);
                    Node n=new Node(neighbor.val);
                    mp.put(n.val,n);
                    newNode.neighbors.add(n);
                }else
                    newNode.neighbors.add(mp.get(neighbor.val));
            }
        }
        
        return result;
    }
}
