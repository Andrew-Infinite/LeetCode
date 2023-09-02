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
    public int rob(TreeNode root) {
        //left max without left + root
        //right max without right + root
        //left max with left
        //right max with right
        int[] ans = dfs(root);
        return Math.max(ans[0],ans[1]);
    }
    int[] dfs(TreeNode root){
        if(root == null){
            //{without,with}
            return new int[]{0,0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        return new int[]{Math.max(left[1],left[0])+Math.max(right[1],right[0]),left[0]+root.val+right[0]};
    }
}
