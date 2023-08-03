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
    vector<int> a;
    int level = 1;
    vector<int> rightSideView(TreeNode* root) {
        if(root==nullptr){
            return a;
        }
        if(a.size()<level){
            a.push_back(root->val);
        }else{
            a[level-1]=root->val;
        }
        level++;
        rightSideView(root->left);
        rightSideView(root->right);
        level--;
        return a;
    }
};