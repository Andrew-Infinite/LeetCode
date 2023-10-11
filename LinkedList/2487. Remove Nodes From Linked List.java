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
        while(head != null)
        {
            while(!stack.isEmpty() && stack.peek().val < head.val)
            {
                stack.pop();
            }
            stack.push(head);
            head = head.next;
        }
        head = stack.pop();
        while(!stack.isEmpty())
        {
            stack.peek().next = head;
            head = stack.pop();
        }
        return head;
    }
}
