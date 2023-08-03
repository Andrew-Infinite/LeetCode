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
    vector<int> preorderTraversal(TreeNode* root) {
        stack<TreeNode*> myStack;
        vector<int> answer;
        while(root!=nullptr||!myStack.empty()){
            while(root!=nullptr){
                answer.push_back(root->val);
                myStack.push(root);
                root=root->left;
            }
            root=myStack.top()->right;
            myStack.pop();
        }
        return answer;
    }
};