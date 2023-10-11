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
    ArrayList<String> ans = new ArrayList<String>();
    int index = 0;
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
        {
            return ans;
        }
        StringBuilder temp = new StringBuilder();
        if(ans.size() <= index)
        {
            temp.append(root.val);
            ans.add(temp.toString());
        }
        else
        {
            temp.append(ans.get(index));
            temp.append( "->");
            temp.append(root.val);
            ans.set(index,temp.toString());
        }
        binaryTreePaths(root.left);
        if(root.left != null && root.right != null)
        {
            index++;
            ans.add(temp.toString());
        }
        binaryTreePaths(root.right);
        return ans;
    }
}
