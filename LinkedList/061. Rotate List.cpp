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
class myQueue{
    public:
        int i;
        int sizeLimit;
        ListNode* Newhead;
        ListNode* tail;
        myQueue(int Size,ListNode* First):
                i(1),sizeLimit(Size+1),
                Newhead(First),tail(First){}
        void add(ListNode* Now){
            tail=Now;
            if(i<sizeLimit){
                i++;
            }else{
                Newhead=Newhead->next;
            }
        }
        bool isFull(){
            if(i<sizeLimit){
                return false;
            }
            return true;
        }
        void divideAndReconnect(ListNode** oldHead,ListNode* oldTail, ListNode* newHead){
            ListNode* temp = *oldHead;
            *oldHead = newHead->next;
            newHead->next=nullptr;
            oldTail->next=temp;
            
            
        }
};
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if(head==nullptr||head->next==nullptr||k==0){
            return head;
        }
        
        for(int j=0;j<2;j++){
            myQueue q(k,head);
            int size=0;
            ListNode* Now = head->next;
            while(Now!=nullptr){
                q.add(Now);
                Now=Now->next;
                size++;
            }
            if(q.isFull()){
                q.divideAndReconnect(&head,q.tail,q.Newhead);
                return head;
            }else{
                k=k%(size+1);
                if(k==0){
                    j++;
                }
            }
        }
        return head;
        
    }
};

//k > lenght
//k <= length