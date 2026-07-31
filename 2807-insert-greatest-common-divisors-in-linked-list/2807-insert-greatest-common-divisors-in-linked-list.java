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

    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }


    public ListNode insertGreatestCommonDivisors(ListNode head) {
         if(head.next==null){
            return head;
         }

        ListNode slow = head ;
        ListNode fast = head.next;

        if(fast==null){
            return slow;
        }

        while(fast!=null){
            int g = gcd(fast.val,slow.val);
            ListNode newNode = new ListNode(g);
            slow.next=newNode;
            newNode.next = fast;
            slow = fast;
            fast=fast.next;
        }

        return head;
        

        
    }
}