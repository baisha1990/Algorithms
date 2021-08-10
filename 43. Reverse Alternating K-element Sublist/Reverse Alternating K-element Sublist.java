/* Given the head of a LinkedList and a number ‘k’, reverse every alternating ‘k’ sized 
sub-list starting from the head. If, in the end, you are left with a 
sub-list with less than ‘k’ elements, reverse it too.*/

public static ListNode reverse(ListNode head, int k) {
    ListNode cur = head, prev = null;
    while(cur != null) {
        ListNode prevOfLast = prev, lastOfSublist = cur;
        for(int i = 0; i < k && cur != null; i++){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        if(prevOfLast != null)
            prevOfLast.next = prev;
        else
            head = prev;
        lastOfSublist.next = cur;
        for(int i = 0; i < k && cur != null; i++) {
            prev = cur;
            cur = cur.next;
        }
    }
    return head;
}