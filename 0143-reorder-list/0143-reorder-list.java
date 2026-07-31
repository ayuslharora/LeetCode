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

    public ListNode revers(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode newHead = revers(head.next);

        ListNode save = head.next;
        save.next = head;
        head.next = null;

        return newHead;
    }

    public void reorderList(ListNode head) {
        if(head.next==null){
            // return head;
        }

        
        ListNode fast = head;
        ListNode slow = head;

        int len = 0;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode t2 = slow.next;
        slow.next = null;
        ListNode t1 = head;
        t2 = revers(t2);
        ListNode temp = new ListNode(0);
        ListNode shead = temp;

        while(t1!=null || t2!=null){
            if(t1 !=null && t2!=null){
                if(len %2==0){
                    temp.next = t1;
                    t1 = t1.next;
                }else{
                    temp.next = t2;
                    t2 = t2.next;
                }
                len++;
                temp = temp.next;
            }

            if(t1==null){
                temp.next = t2;
                t2 = null;
            }
            if(t2==null){
                temp.next = t1;
                t1=null;
            }
        }

        // return shead.next;
    }
}