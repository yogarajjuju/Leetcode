/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow =head;
        while(fast!=null&& fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=head;// it is used to start the fast pointer to traverse from the head or we can change the slow = head but we need to move both by 1 only

                while(slow !=fast){
                    fast=fast.next;
                    slow=slow.next;
                }
                return fast;// here we can return anyone of the pointers
            }
        }
        return null;
        
    }
}