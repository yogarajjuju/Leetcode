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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode prev= dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode current = prev.next;
        ListNode next;

        for(int i =0; i<right-left;i++){
            next=current.next;
            current.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;

        
    }
}