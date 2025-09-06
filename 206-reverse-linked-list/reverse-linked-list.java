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
 //iteration way
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode present=head;
        while(present!=null){
             ListNode next=present.next; /// save the next node;
             present.next=prev;//reverse the list
             prev=present;//move the perv forward;

             present=next;//move present forward
        }
        return prev; //  this is new head of the list
        
    }
}