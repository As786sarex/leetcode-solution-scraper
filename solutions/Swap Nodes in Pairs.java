/**
 * Definition for singly-linked list. public class ListNode { int val; 
     ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return head;
        if (head.next == null)
            return head;
        ListNode ln = new ListNode(0);
        ln.next = head.next;
        ListNode t = null;
        while (head != null) {
            if (head.next == null)
                break;
            ListNode temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            if (t != null) {
                t.next = temp;
            }
            t = head;
            head = head.next;
        }
        return ln.next;
    }
}
