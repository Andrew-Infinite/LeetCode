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
    stack<TreeNode*> myStack;
    vector<int> answer;
    vector<int> inorderTraversal(TreeNode* root) {
        while(root!=nullptr||!myStack.empty()){
            while(root!=nullptr){
                myStack.push(root);
                root=root->left;
            }
            root=myStack.top();
            myStack.pop();
            answer.push_back(root->val);
            root=root->right;
        }
        return answer;
    }
};

//left base
//root
//right