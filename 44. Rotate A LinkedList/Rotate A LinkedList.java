/* Given the head of a Singly LinkedList and a number ‘k’, rotate the LinkedList to the right by ‘k’ nodes. */

public static ListNode rotate(ListNode head, int rotations) {
    ListNode lastNode = head;
    int l = 1;
    while(lastNode.next != null) {
        lastNode = lastNode.next;
        l++;
    }
    lastNode.next = head;
    rotations = rotations % l;
    int skip = l - rotations;
    ListNode lastNodeOfRotatedList = head;
    for(int i = 0; i < skip - 1; i++) {
        lastNodeOfRotatedList = lastNodeOfRotatedList.next;
    }
    head = lastNodeOfRotatedList.next;
    lastNodeOfRotatedList.next = null;
    return head;
}