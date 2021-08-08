/* Given the head of a LinkedList and a number ‘k’, reverse every ‘k’ sized 
sub-list starting from the head. If, in the end, you are left with a 
sub-list with less than ‘k’ elements, reverse it too.*/

public static ListNode reverse(ListNode head, int k) {
    ListNode cur = head, prev = null;
    while(true) {
        ListNode prevOfLast = prev, lastOfSubList = cur;
        for(int i = 0; cur != null && i < k; i++) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        if(prevOfLast != null)
            prevOfLast.next = prev;
        else
            head = prev;
        lastOfSubList.next = cur;
        if(cur == null)
            break;
        prev = lastOfSubList;
    }
    return head;
}