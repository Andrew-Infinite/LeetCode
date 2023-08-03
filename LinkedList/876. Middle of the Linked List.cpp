/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int getSize(ListNode* head){
        int Size=0;
        while(head!=nullptr){
            Size++;
            head=head->next;
        }
        return Size;
    }
    ListNode* middleNode(ListNode* head) {
        int Size=getSize(head)/2+1;
        for(int i=1;i<Size;i++){
            head=head->next;
        }
        return head;
    }
};