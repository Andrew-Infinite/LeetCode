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
    bool isSymmetric(TreeNode* root){
        return SymCompare(root->left,root->right);
    }
    bool SymCompare(TreeNode* p,TreeNode* q){
        if(p==nullptr||q==nullptr){
            if(p==q){
                return true;
            }else{
                return false;
            }
        }
        if(SymCompare(p->right,q->left)&&SymCompare(p->left,q->right)&&p->val==q->val){
            return true;
        }else{
            return false;
        }
    }
};