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
    Stack<ListNode> stack = new Stack<ListNode>();
    public ListNode removeNodes(ListNode head) {
        if(head == null)
            return head;
        ListNode temp = removeNodes(head.next);
        if(temp != null && temp.val > head.val)
        {
            return temp;
        }
        head.next = temp;
        return head;
    }
}
