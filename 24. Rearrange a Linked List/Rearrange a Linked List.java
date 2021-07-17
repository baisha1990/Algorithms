/*Given the head of a Singly LinkedList, write a method to modify the LinkedList 
such that the nodes from the second half of the LinkedList are inserted alternately 
to the nodes from the first half in reverse order. So if the LinkedList has 
nodes 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null, your method should return 1 -> 6 -> 2 -> 5 -> 3 -> 4 -> null.
Your algorithm should not use any extra space and the input LinkedList 
should be modified in-place.*/

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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode f = head, sl = head, p = head;
        while(f != null && f.next != null) {
            f = f.next.next;
            p = sl;
            sl = sl.next;
        }
        p.next = null;
        ListNode rev = reverse(sl);
        merge(head, rev);        
    }
    
    public void merge(ListNode l1, ListNode l2) {
        while(l1 != null) {
            ListNode n1 = l1.next, n2 = l2.next;
            l1.next = l2;
            if(n1 == null)
                break;
            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }
    
    public ListNode reverse(ListNode head) {
        ListNode cur = head, prev = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}