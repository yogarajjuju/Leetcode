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
    public boolean hasCycle(ListNode head) {
        ListNode fast =head, slow = head;
        // Floyd’s Cycle Detection or fast and slow pointer or tortise and hare method 

        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow==fast) return true;
        }
        return false;
        
    }
}