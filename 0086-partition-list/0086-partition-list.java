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
    public ListNode partition(ListNode head, int B) {
        ListNode smaller = new ListNode(0);
        ListNode shead = smaller;
        ListNode bigger = new ListNode(0); 
        ListNode sec = bigger;
        ListNode temp = head;

        while(temp!=null){
            if(temp.val<B){
                smaller.next = temp;
                smaller = smaller.next;
            }else{
                bigger.next = temp;
                bigger = bigger.next;
            }
            temp = temp.next;
        }
        // smaller.next = null;
        bigger.next = null;
        smaller.next = sec.next;

        return shead.next;
    }
}