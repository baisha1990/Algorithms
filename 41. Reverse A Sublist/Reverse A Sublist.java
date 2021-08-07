/* Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the 
LinkedList from position ‘p’ to ‘q’. */

public static ListNode reverse(ListNode head, int p, int q) {
    int count = 1;
    ListNode cur = head, prev = null;
    while(cur != null && count < p) {
        prev = cur;
        cur = cur.next;
        count++;
    }
    ListNode lastOfFirstList = prev;
    ListNode lastNodeOfSubList = cur;
    ListNode next = null;
    while(cur != null && count <= q) {
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
        count++;
    }
    if(lastOfFirstList != null)
        lastOfFirstList.next = prev;
    else
        head = prev;
    lastNodeOfSubList.next = cur;
    return head;
}
