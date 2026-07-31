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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode shead = new ListNode(0);
        ListNode temp = shead;
        temp.next = head;

        while(temp.next!=null && temp.next.next!=null){
            ListNode first = temp.next;
            ListNode second = first.next;
            ListNode NextNode = second.next;

            first.next = NextNode;
            temp.next = second;
            second.next = first;
            temp = first;
        }
        return shead.next;
    }
}