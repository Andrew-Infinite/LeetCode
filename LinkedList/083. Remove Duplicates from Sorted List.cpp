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
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* Now=head;
        
        if(head==nullptr||head->next==nullptr){
            return head;
        }
        while(Now!=nullptr){
            
            ListNode* Next=Now;
            
            while(Next->next!=nullptr&&Next->val==Next->next->val){
                Next=Next->next;
            }
            Next=Next->next;
            if(Next!=Now){
                Now->next=Next;
            }
            Now=Now->next;
        }
        return head;
    }
};

//nullptr then do nothing
//if only one item, do nothing
//