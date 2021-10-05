/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp=new ListNode(8);
        ListNode res=temp;
        while(l1!=null&&l2!=null){
            temp.val=(((l1.val+l2.val)+carry)%10);
            carry=((l1.val+l2.val)+carry)/10;
            l1=l1.next;
            l2=l2.next;
            temp.next=new ListNode(0);
            temp=temp.next;

        }
        if (l1==null){
            while(l2!=null){
                temp.val=(((l2.val)+carry)%10);
                carry=(((l2.val)+carry)/10);
                l2=l2.next;
                temp.next=new ListNode(0);
                temp=temp.next;
            }
        }
        else if (l2==null) {
            while (l1 != null) {
                temp.val = (((l1.val) + carry) % 10);
                carry = (((l1.val) + carry) / 10);
                l1 = l1.next;
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }
        if (carry!=0){
            temp.val=carry;
        }
        ListNode fres=res;
        if (res.next!=null&&temp.val==0) {
            while (res.next.next != null) {
                res = res.next;
            }
            res.next = null;
        }
        return fres;

    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp=new ListNode(8);
        ListNode res=temp;
        while(l1!=null&&l2!=null){
            temp.val=(((l1.val+l2.val)+carry)%10);
            carry=((l1.val+l2.val)+carry)/10;
            l1=l1.next;
            l2=l2.next;
            temp.next=new ListNode(0);
            temp=temp.next;

        }
        if (l1==null){
            while(l2!=null){
                temp.val=(((l2.val)+carry)%10);
                carry=(((l2.val)+carry)/10);
                l2=l2.next;
                temp.next=new ListNode(0);
                temp=temp.next;
            }
        }
        else if (l2==null) {
            while (l1 != null) {
                temp.val = (((l1.val) + carry) % 10);
                carry = (((l1.val) + carry) / 10);
                l1 = l1.next;
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }
        if (carry!=0){
            temp.val=carry;
        }
        ListNode fres=res;
        if (res.next!=null&&temp.val==0) {
            while (res.next.next != null) {
                res = res.next;
            }
            res.next = null;
        }
        return fres;

    }
}
