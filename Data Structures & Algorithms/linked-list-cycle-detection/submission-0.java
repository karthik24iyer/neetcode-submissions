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
        if(head==null || head.next==null) {
            return false;
        }

        ListNode singlePtr = head;
        ListNode doublePtr = head;

        while(doublePtr!=null && doublePtr.next!=null) {
            singlePtr=singlePtr.next;
            doublePtr=doublePtr.next.next;
            if(singlePtr == doublePtr) {
                return true;
            }
        }
        return false;
    }
}