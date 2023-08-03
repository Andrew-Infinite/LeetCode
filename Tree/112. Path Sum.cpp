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
    bool PathExist=false;
    bool hasPathSum(TreeNode* root, int targetSum) {
        if(root==nullptr){
            return false;
        }else{
            Diving(root,0,targetSum);
        }
        return PathExist;
    }
    void Diving(TreeNode* root, int count, int targetSum){
        if(PathExist){
            return;
        }
        if(root->left==nullptr&&root->right==nullptr){
            count+=root->val;
            if(count==targetSum){
                PathExist=true;
            }
            return;
        }
        if(root->left!=nullptr){
            Diving(root->left,count+root->val,targetSum);
        }
        if(root->right!=nullptr){
            Diving(root->right,count+root->val,targetSum);
        }
        
    }
};