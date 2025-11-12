/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       while(node.next!=null){
        ListNode NextNode = node.next;
        int temp = node.val;
        node.val=NextNode.val;
        NextNode.val = temp;
        if(NextNode.next==null){
            node.next=null;
        }else{
            node = NextNode;
        }
       }
    }
}