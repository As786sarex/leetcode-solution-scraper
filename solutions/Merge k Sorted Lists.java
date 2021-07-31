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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue=new PriorityQueue<>((l1,l2)->(l1.val-l2
            .val));
        for(ListNode temp:lists) {
            if(temp!=null)
                queue.add(temp);
        }
        ListNode head=new ListNode(0);
        ListNode result=head;
        while(!queue.isEmpty()){
            ListNode temp=queue.poll();
            head.next=temp;
            head=head.next;
            if(temp.next!=null)
                queue.add(temp.next);
        }
        return result.next;
    }
}
