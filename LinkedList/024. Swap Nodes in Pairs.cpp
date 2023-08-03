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
    ListNode* swapPairs(ListNode* head) {
        if(head == nullptr || head->next==nullptr){
            return head;
        }
        
        //first pair swap
        ListNode* SecondNode=head->next; ListNode* FirstNode = SecondNode->next; ListNode* PrevNode = head;
        head->next=SecondNode->next;
        SecondNode->next=head;
        //remember head
        head=SecondNode;
        
        while(FirstNode!=nullptr){
            SecondNode=FirstNode->next;
            if(SecondNode==nullptr){
                break;
            }
            FirstNode->next=SecondNode->next;
            SecondNode->next=FirstNode;
            
            //moving forward phase
            PrevNode->next=SecondNode;
            PrevNode=FirstNode;
            FirstNode=FirstNode->next;
        }
        
        return head;
    }
};

//odd or even
//is it empty
//is it 1
//is it lesser than 4