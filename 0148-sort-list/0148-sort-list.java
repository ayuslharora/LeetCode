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

    public ListNode merg(ListNode list1 ,ListNode list2){
        if(list1==null){
            return list2;
        }

        if(list2==null){
            return list1;
        }

        if(list1.val>list2.val){
            return merg(list2,list1);
        }

        ListNode head = list1;
        ListNode temp = head;

        list1 = list1.next;

        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
        }

        temp.next = (list1==null)?list2:list1;

        return head;
    }

    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if( head==null || head.next==null){
            return head;
        }

        ListNode m = middle(head);
        ListNode l2 = m.next;
        m.next = null;
        ListNode l1 = sortList(head);
        l2 = sortList(l2);

        return merg(l1,l2);
    }
}