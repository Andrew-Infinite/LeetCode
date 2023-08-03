**
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
    private int max=0;
    public int maxDepth(TreeNode root) {
        return maxDepth2(root, 0);
    }
    private int maxDepth2(TreeNode root, int level){
        if(root==null){
            return level;
        }
        int left = maxDepth2(root.left,level+1);
        int right = maxDepth2(root.right,level+1);
        int localMax = (left>right) ? left : right;
        max = (localMax>max) ? localMax : max;

        return max;
    }
}