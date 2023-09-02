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
    int indexp=0;
    int indexi=0;
    boolean startReturning = false;
    boolean NodeIsCreated = false;
    HashSet<Integer> isVisited = new HashSet<Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if(indexp>=preorder.length || indexi>=inorder.length || isVisited.contains(inorder[indexi])){
            startReturning = true;
            //indexp++;
            //indexi++;
            return null;
        }
        isVisited.add(preorder[indexp]);
        TreeNode now = new TreeNode(preorder[indexp]);
        NodeIsCreated = true;
        if(preorder[indexp]==inorder[indexi]){
            indexi++;
        }else{
            if(NodeIsCreated){
                indexp++;
                NodeIsCreated = false;
            }
            now.left = buildTree(preorder,inorder);
        }
        if(indexi<preorder.length&&now.val==inorder[indexi]){
            indexi++;
            startReturning=false;
        }
        if(!startReturning){
            if(NodeIsCreated){
                indexp++;
                NodeIsCreated = false;
            }
            now.right = buildTree(preorder,inorder);
        }
        return now;
    }
}

//porder == iorder && pordernext == iordernext -> left tree ended
//porder == iorder && pordernext != iordernext -> left and right ended
//
