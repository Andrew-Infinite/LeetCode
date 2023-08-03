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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        vector<ListNode*> myList;
        ListNode* temp=head;
        while(temp!=nullptr){
            myList.push_back(temp);
            temp=temp->next;
        }
        int index=myList.size()-1-n;
        if(index>=0){
            temp=myList[index];
            temp->next=temp->next->next;
        }else{
            head=head->next;
        }
        return head;
    }
};