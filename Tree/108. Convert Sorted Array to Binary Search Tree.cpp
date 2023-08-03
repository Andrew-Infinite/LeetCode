/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<TreeNode*> list;
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        int lo=0;int hi=nums.size()-1;
        int mid = (lo + hi)/2;
        TreeNode *root=new TreeNode(nums[mid]);
        for(int i=0;i<hi+1;i++){
            list.push_back(new TreeNode(nums[i]));
        }
        if(lo!=mid){
            root->left=new TreeNode();
            findHalf(lo,mid-1,root->left,nums);
        }
        if(hi!=mid){
            root->right=new TreeNode();
            findHalf(mid+1,hi,root->right,nums);
        }
        return root;
    }
    void findHalf(int lo,int hi, TreeNode* root,vector<int>& nums){
        int mid = (lo + hi)/2;
        if(lo!=mid){
            root->left=new TreeNode();
            findHalf(lo,mid-1,root->left,nums);
        }
        if(hi!=mid){
            root->right=new TreeNode();
            findHalf(mid+1,hi,root->right,nums);
        }
        root->val=nums[mid];
    }
};