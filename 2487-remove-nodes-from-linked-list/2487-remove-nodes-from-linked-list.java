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
public ListNode reverse(ListNode head){
        ListNode temp = head, prev = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int max = Integer.MIN_VALUE;
        while(head != null){
            if(head.val >= max){
                max = head.val;
                temp.next = new ListNode(max);
                temp = temp.next;
            }
            head = head.next;
        }
        return reverse(res.next);
    }
}