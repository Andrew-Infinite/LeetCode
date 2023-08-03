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
    ArrayList<Integer> a = new ArrayList<Integer>();
    public int maxLevelSum(TreeNode root) {
        levelOrder(root,1);
        int max = a.get(0);
        int index = 1;
        for(int i=1;i<a.size();i++){
            if(a.get(i)>max){
                max = a.get(i);
                index=i+1;
            }
        }
        System.out.print(max);
        return index;
    }
    public void levelOrder(TreeNode root, int level){
        if(root==null){
            return;
        }
        if(a.size()<level) { a.add(root.val); }
        else { a.set(level-1, a.get(level-1)+root.val); }
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
    }
}