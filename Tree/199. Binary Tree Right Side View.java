/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> a = new ArrayList<Integer>();
    int level = 1;
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return a;
        }
        if(a.size()<level){
            a.add(root.val);
        }else{
            a.set(level-1,root.val);
        }
        level++;
        rightSideView(root.left);
        rightSideView(root.right);
        level--;
        return a;
    }
}