/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* deleteDuplicates(struct ListNode* head){
    struct ListNode *list1=head;
    if(head==0){
        return head;
    }
    struct ListNode *temp=head->next;
    while(head->next!=0){
        int val=head->val;
        if(val==temp->val){
            while(temp!=0&&val==temp->val){
                temp=temp->next;
            }
            head->next=temp;
        }else{
            head=temp;
        }
    }

    return list1;
    
}