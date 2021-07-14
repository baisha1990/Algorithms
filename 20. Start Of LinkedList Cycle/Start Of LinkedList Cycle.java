/* Given the head of a Singly LinkedList that contains a cycle, write a function to find the starting node of the cycle. */

public static ListNode findCycleStart(ListNode head) {
    ListNode slow = head, fast = head;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast)
            break;
    }
    if(fast == null || fast.next == null)
        return null;
    slow = head;
    while(slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}