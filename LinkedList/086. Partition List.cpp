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
    ListNode* partition(ListNode* head, int x) {
        if(head==nullptr||head->next==nullptr){
            return head;
        }
        ListNode* Now=head;
        queue <ListNode*> part1;
        queue <ListNode*> part2;
        while(Now!=nullptr){
            if(Now->val<x){
                part1.push(Now);
            }else{
                part2.push(Now);
            }
            Now=Now->next;
        }
        if(!part1.empty()){
            Now=part1.front();
            part1.pop();
            head = Now;
        }else{
            return head;
        }
        
        while(!part1.empty()){
            Now->next=part1.front();
            part1.pop();
            Now=Now->next;
        }
        while(!part2.empty()){
            Now->next=part2.front();
            part2.pop();
            Now=Now->next;
        }
        Now->next=nullptr;
        return head;
    }
};

//empty and only one item
//no larger or equal
//no smaller