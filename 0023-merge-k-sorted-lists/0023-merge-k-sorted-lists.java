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

    public ListNode merg(ListNode list1 , ListNode list2){
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

        if(list1!=null){
            temp.next = list1;   
        }

        if(list2!=null){
            temp.next = list2;
        }

        return head;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;

        for(int i = 0; i < lists.length; i++){
            result = merg(result, lists[i]);
        }

        return result;
    }
}