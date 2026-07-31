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

    public ListNode remover(ListNode head , int n){

        if(n==1){
            return head.next;
        }

        if(head.next == null){
            return null;
        }


        ListNode temp = head;

        // while(temp!=null){
        //     temp = temp.next;
        //     len++;
        // }

        // if(len<n){
        //     n = len -1;
        // }

        int i = 1 ;
        // temp = head;

        while(i<n-1){
            temp = temp.next;
            i++;
        }

        if(temp==null || temp.next==null){
            temp.next = null;
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }

        int k = len - n +1;

        return remover(head , k);
    }
}