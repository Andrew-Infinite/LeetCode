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
    ListNode* merge(ListNode *list1,ListNode *list2){
         if(list2==nullptr){
            return list1;
        }else if(list1==nullptr){
            return list2;
        }
        if(list1->val > list2->val){
            ListNode * temp=list1;
            list1=list2;
            list2 = temp;
        }
        ListNode* head=list1;
        //both is not null;
        while(list1->next!=nullptr){
            ListNode * nextNode=list1->next;
            if(nextNode->val > list2->val){
                list1->next=list2;
                list2 = nextNode;
            }else{
                list1=nextNode;
            }
        }
        list1->next=list2;
        ListNode* myNewNode=head;
        return head;
    }
    void mergeLists(vector<ListNode*>& lists,int lo,int hi){
        if(lo==hi){
            return;
        }
        int mid=(hi+lo)/2;
        mergeLists(lists,lo,mid);
        mergeLists(lists,mid+1,hi);
        
        lists[lo]=merge(lists[lo],lists[mid+1]);
        
    }
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if(lists.size()>1){
            mergeLists(lists,0,lists.size()-1);
        }else if(lists.size()<1){
            return nullptr;
        }
        return lists[0];
    }
};