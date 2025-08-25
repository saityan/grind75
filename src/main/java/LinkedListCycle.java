/**
 * leetcode.com/problems/linked-list-cycle
 */

class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode turtle = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;

            if (turtle == hare) {
                return true;
            }
        }

        return false;
    }
}
