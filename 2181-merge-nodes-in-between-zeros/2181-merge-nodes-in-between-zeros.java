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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode ans =  new ListNode();
        ListNode newHead = ans;
        ListNode temp = head.next;

        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }else{

                ListNode newNode = new ListNode(sum);
                ans.next=newNode;
                ans=ans.next;
                sum=0;
                temp = temp.next;
            }
        }
        if(sum!=0){
            ans.val=sum;
            sum=0;
        }
        return newHead.next;
        
    }
}