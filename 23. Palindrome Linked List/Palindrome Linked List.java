/*Given the head of a Singly LinkedList, write a method to check if the 
LinkedList is a palindrome or not. Your algorithm should use constant space and the 
input LinkedList should be in the original form once the algorithm is finished. 
The algorithm should have O(N)O(N) time complexity where ‘N’ is the number of nodes 
in the LinkedList. */

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
    public boolean isPalindrome(ListNode head) {
        ListNode f = head, s = head;
        while(f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        ListNode mid = s;
        ListNode rev = reverse(mid);
        ListNode temp = head, tempr = rev;
        while(temp != null && tempr != null) {
            if(tempr.val != temp.val)
                return false;
            tempr = tempr.next;
            temp = temp.next;
        }
        return true;
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