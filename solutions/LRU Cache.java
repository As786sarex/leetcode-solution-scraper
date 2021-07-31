class LRUCache {

 private Node head, tail;
    private HashMap<Integer,Node> mp;
    private int capacity;

    public LRUCache(int capacity) {
        mp=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
    }
    public int get(int key) {
        if (!mp.containsKey(key))
            return -1;

        Node node = mp.get(key);
        removeNode(node);
        Node newNode=new Node(key,node.val);
        addNode(newNode);
        mp.put(key,newNode);
        return node.val;
    }

    public void put(int key, int value) {
        Node node=new Node(key,value);
        if(mp.containsKey(key)){
            removeNode(mp.get(key));
            addNode(node);
            mp.put(key,node);
        }
        else{
            if (mp.size()==capacity){
                mp.remove(tail.prev.key);
                removeNode(tail.prev);
            }
            mp.put(key,node);
            addNode(node);
        }
    }

    void addNode(Node node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev=head;
        head.next=node;
    }

    void removeNode(Node node) {
        Node p = node.prev;
        Node n = node.next;
        if (p != null)
            p.next = node.next;
        if (n != null)
            n.prev = node.prev;
        node.next = null;
        node.prev = null;
    }

    static class Node {
        int key,val;
        Node prev, next;

        public Node(int key,int val) {
            this.val = val;
            this.key=key;
            prev = next = null;
        }
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
