/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    ArrayList<Integer> ans = new  ArrayList<Integer>();
    boolean isFind=true;

    int targetLevel=-1;
    TreeNode returnNode=null;
    int referenceLevel=-1;
    int levelNow=0;
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root==null){
            return ans;
        }
        if(isFind){
            if(root==target){
                isFind = false;
                targetLevel = levelNow;
                referenceLevel = levelNow;
                returnNode = target;
            }else{
                levelNow++;
                distanceK(root.left,target,k);
                if(isFind){
                    distanceK(root.right,target,k);
                }
                levelNow--;
            }
        }
        //find k child
        int distance = Math.abs(targetLevel-referenceLevel) + Math.abs(levelNow - referenceLevel);
        //System.out.println(Integer.toString(root.val)+": "+Integer.toString(targetLevel)+" "+Integer.toString(referenceLevel)+" "+Integer.toString(levelNow));

        if(targetLevel!=-1&&distance==k){
            ans.add(root.val);
        }
        levelNow++;
        if(root.left==returnNode){
            referenceLevel = levelNow-1;
            returnNode = root;
            distanceK(root.right,target,k);
        }else if(root.right==returnNode){
            referenceLevel = levelNow-1;
            returnNode = root;
            distanceK(root.left,target,k);
        }else{
            distanceK(root.left,target,k);
            distanceK(root.right,target,k);
        }
        levelNow--;
        return ans;

    }
    /*ArrayList<Integer> ans = new  ArrayList<Integer>();
    int targetLevel=-1;
    TreeNode returnNode=null;
    int referenceLevel=-1;
    int levelNow=0;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root==null){
            return ans;
        }
        if(targetLevel!=-1){
            System.out.print(root.val);
            System.out.print(", ");
            System.out.print(referenceLevel);
            System.out.print(", ");
            System.out.println(levelNow);
        }
        int distance = Math.abs(targetLevel-referenceLevel) + Math.abs(levelNow - referenceLevel);
        if(targetLevel!=-1 && distance==k){
            ans.add(root.val);
        }
        if(root==target){
            targetLevel=levelNow;
            referenceLevel=levelNow;
            returnNode = root;
        }
        levelNow++;
        if(returnNode==null){
            distanceK(root.right,target,k);
        }
        if(returnNode==null){
            distanceK(root.left,target,k);
        }
        if(returnNode!=null){
            if(root.left == returnNode){
                referenceLevel=levelNow-1;
                distanceK(root.right,target,k);
                returnNode = root;
            }else if(root.right == returnNode){
                referenceLevel=levelNow-1;
                distanceK(root.left,target,k);
                returnNode = root;
            }else{
                distanceK(root.right,target,k);
                distanceK(root.left,target,k);
            }
        }
        levelNow--;
        return ans;
    }*/
}
