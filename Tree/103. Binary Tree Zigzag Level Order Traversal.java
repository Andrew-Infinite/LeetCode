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
    ArrayList<List<Integer>> a = new  ArrayList<List<Integer>>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        levelOrder(root,1);
        for(int i=1;i<a.size();i+=2){
            Collections.reverse(a.get(i));
        }
        return a;
    }
    public void levelOrder(TreeNode root, int level){
        if(root==null){
            return;
        }
        if(a.size()<level){
            a.add(new ArrayList<Integer>());
        }
        
        a.get(level-1).add(root.val);
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
    }
}