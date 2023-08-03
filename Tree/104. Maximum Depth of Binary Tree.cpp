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
    int max=1;
    int maxDepth(TreeNode* root) {
        if(root==nullptr){
            return 0;
        }
        Diving(root,1);
        return max;
    }
    void Diving(TreeNode* root,int count){
        if(root->left==nullptr&&root->right==nullptr){
            if(max<count){
                max=count;
            }
            return;
        }
        if(root->left!=nullptr){
            Diving(root->left,count+1);
        }
        if(root->right!=nullptr){
            Diving(root->right,count+1);
        }
    }
};