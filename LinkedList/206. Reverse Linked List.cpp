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
    ListNode* reverseList(ListNode* head) {
        if(head==nullptr||head->next==nullptr){
            return head;
        }
        ListNode* Next1=head->next;
        ListNode* Next2=Next1->next;
        head->next=nullptr;
        while(Next2!=nullptr){
            Next1->next=head;
            head=Next1;
            Next1=Next2;
            Next2=Next2->next;
        }
        Next1->next=head;
        return Next1;
    }
};

//head = null, end
//head->next = null, end