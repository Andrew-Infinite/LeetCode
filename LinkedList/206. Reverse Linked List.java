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
    Stack<ListNode> x = new Stack<ListNode>();
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        while(head.next!=null){
            x.push(head);
            head = head.next;
        }
        ListNode Next = head;
        while(!x.empty()){
            Next.next = x.pop();
            Next = Next.next;
        }
        Next.next = null;
        return head;
    }
}