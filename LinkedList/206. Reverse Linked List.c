/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head){
    if(head==NULL){return head;}
    if(head->next==NULL){
        return head;
    }
    
    struct ListNode* prev=head;
    struct ListNode* Next;
    struct ListNode* Now=head->next;
    
    head->next=NULL;
    
    if(Now->next==NULL){//case 2
        Now->next=prev;
        return Now;
    }
    while(Now->next!=NULL){
        Next=Now->next;
        Now->next=prev;
        prev=Now;
        Now=Next;
    }
    Now->next=prev;
    return Now;
}