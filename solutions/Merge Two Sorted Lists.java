/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        else{
            ListNode root=new ListNode(0);
            ListNode res=root;
            while(true){
                if(l1==null){
                    root.next=l2;
                    break;
                }
                if(l2==null){
                    root.next=l1;
                    break;
                }
                if(l1.val<=l2.val){
                    root.next=l1;
                    l1=l1.next;
                }
                else{
                    root.next=l2;
                    l2=l2.next;
                }
                root=root.next;
            }
            return res.next;
        }
    }
}
