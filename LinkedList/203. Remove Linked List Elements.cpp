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
    ListNode* removeElements(ListNode* head, int val) {
        bool istheNum;
        if(head==nullptr){
            return head;
        }
        ListNode* Now = head->next;
        ListNode* Prev = head;
        while(Now!=nullptr){
            if(Now->val==val){
                istheNum=true;
                if(Now->next==nullptr){
                    Prev->next=nullptr;
                }
            }else if(istheNum){
                Prev->next=Now;
                Prev=Now;
            }else{
                Prev=Now;
            }
            Now=Now->next;
        }
        if(head->val==val){
            head=head->next;
        }
        return head;
    }
};

//no element
//only contain element needed to be remove
//head is element to be remove
//center is element to be remove
//tail is element to be remove