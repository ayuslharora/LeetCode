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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 0 ;
        ListNode temp = list1;
        ListNode temp1 = list1;
        while(i<a-1 && temp!=null){
            temp=temp.next;
            i++;
        }

        if(temp==null){
            return list1;
        }


        i=0;
        while(i<b && temp1!=null){
            temp1=temp1.next;
            i++;
        }

        if(temp1==null){
            return list1;
        }

        ListNode temp2 = list2;



        while(temp2.next!=null){
            temp2=temp2.next;
        }

        temp.next=list2;
        temp2.next = temp1.next;

        return list1;



    }
}