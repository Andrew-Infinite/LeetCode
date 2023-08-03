/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* tempA=headA;
        ListNode* tempB=headB;
        int countA=0,countB=0;
        while(tempA!=nullptr){
            countA++;
            tempA=tempA->next;
        }
        while(tempB!=nullptr){
            countB++;
            tempB=tempB->next;
        }
        
        if(countA<countB){//make A always longer
            int temp=countA;
            countA=countB;
            countB=temp;
            
            tempA=headA;
            headA=headB;
            headB=tempA;
        }
        int i=0;
        while(i<(countA-countB)){
            headA=headA->next;
            i++;
        }
        while(headA!=nullptr){
            if(headA==headB){
                return headA;
            }
            headA=headA->next;
            headB=headB->next;
        }
        return nullptr;
    }
};