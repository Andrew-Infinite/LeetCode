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
    int maxSum = Integer. MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    int dfs(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);
        maxSum = Math.max(maxSum,left+right+root.val);
        maxSum = Math.max(maxSum,right+root.val);
        maxSum = Math.max(maxSum,left+root.val);
        maxSum = Math.max(maxSum,root.val);

        return Math.max(Math.max(left,right)+root.val,root.val);
    }
}