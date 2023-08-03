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
    vector<vector<int>> a;
    int level = 1;
    vector<vector<int>> levelOrder(TreeNode* root) {
        if(root==nullptr){
            return a;
        }
        if(a.size()<level){
            a.push_back(vector<int>());
        }
        a[level-1].push_back(root->val);
        level++;
        levelOrder(root->left);
        levelOrder(root->right);
        level--;
        
        return a;
    }
};