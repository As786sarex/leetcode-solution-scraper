class MinStack {

    /** initialize your data structure here. */
    private Entry<Integer> head,tail;
    public MinStack() {
        head=new Entry(null,null);
        tail=head;
    }
    
    public void push(int val) {
        if(tail.min==null)
            tail.next=new Entry<>(val,val);
        else
            tail.next=new Entry<>(val,Integer.min(val,tail.min));
        tail.next.prev=tail;
        tail=tail.next;
    }
    
    public void pop() {
        tail=tail.prev;
        tail.next=null;
    }
    
    public int top() {
        return tail.value;
    }
    
    public int getMin() {
        return tail.min;
    }
    
    static class Entry<T extends Comparable<T>> implements Comparable<Entry<T
        >>{
        T value;
        T min;
        Entry<T> next,prev;
        
        public Entry(T val,T min) {
            this.value=val;
            this.min=min;
            this.next=null;
            this.prev=null;
        }
        
        @Override
        public int compareTo(Entry<T> object){
            return ((Comparable<T>)this.value).compareTo(object.value);
        }
    }
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
