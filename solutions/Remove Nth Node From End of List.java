/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int x=deleteReverse(head,n);
        return n==x?head.next:head;
        
    }
    
    private int deleteReverse(ListNode node,int k){
        if(node==null)
            return 0;
        
        int x= deleteReverse(node.next,k);
        if(x==k&&node.next!=null)
            node.next=node.next.next;
        return x+1;
    }
    
}
