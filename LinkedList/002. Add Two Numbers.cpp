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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* answer=new ListNode();
        ListNode* temp=answer;
        ListNode* junk;
        bool isFinished=false;
        bool isL1finish=false;
        bool isL2finish=false;
        int overflow=0;
        int num;
        while(!isFinished){
            //System.out.println(l1.val+" "+l2.val+" "+overflow + l2.next);
            num = l1->val+l2->val+overflow;
            if(num>9){
                num=num-10;
                overflow=1;
            }else{
                overflow=0;
            }
            temp->val=num;
            
            
            if(l1->next!=nullptr ){
                junk=l1;
                l1=l1->next;
                delete junk;
            }else{
                if(isL1finish==false){//&&l1.next==nullptr 
                    l1->val=0;
                    isL1finish=true;
                }
            }
            
            if(l2->next!=nullptr ){
                junk=l2;
                l2=l2->next;
                delete junk;
            }else{
                if(isL2finish==false){//&&l1.next==nullptr 
                    l2->val=0;
                    isL2finish=true;
                }
            }
            
            if(isL1finish&&isL2finish){
                isFinished=true;
                if(overflow==1){
                    temp->next=new ListNode(1);
                }
            }else{
                temp->next=new ListNode();
                temp=temp->next;
            }
        }
        return answer;
    }
};