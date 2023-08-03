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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* temp;
        if(list1==nullptr){
            return list2;
        }
        if(list2==nullptr){
            return list1;
        }
        if(list1->val > list2->val){
            //swap node
            temp = list2;
            list2 = list1;
            list1 = temp;
        }
        
        ListNode* head = list1;
        while(list1->next!=nullptr){
            temp = list1->next;
            if(temp->val > list2->val){
                list1->next = list2;
                list2 = temp;
            }
            list1 = list1->next;
        }
        list1->next=list2;
        return head;
    }
};

//head is smallest
// i node is always smaller than i + 1
//tail is largest
//either is null, return not null
//both is null, return null

//