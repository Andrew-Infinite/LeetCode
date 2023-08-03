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
    bool isPalindrome(ListNode* head) {
        int Size = getSize(head);
    
        stack <int> temp;
        for(int i=1;i<(Size-1)/2+1;i++){
            temp.push(head->val);
            head=head->next;
        }
        if(Size%2==0){
            temp.push(head->val);
        }
        head=head->next;
        while(head!=nullptr){
            int temp2=temp.top();
            temp.pop();
            if(head->val!=temp2){
                return false;
            }
            head=head->next;
        }
        return true;
    }
};