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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        ListNode f = list1;
        ListNode s = list2;

        while(f!=null&& s!=null){
            if(f.val<s.val){
                tail.next=f;
                f=f.next;
            } else{
                tail.next=s;
                s=s.next;
            }
            tail= tail.next;
        }
        if(f!=null){
            tail.next=f;
        } else{
            tail.next=s;
        }
        return dummy.next;
        
    }
}