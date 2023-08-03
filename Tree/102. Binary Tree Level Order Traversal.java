class Solution {
    ArrayList<List<Integer>> a = new  ArrayList<List<Integer>>();
    int level = 1;
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return a;
        }
        if(a.size()<level){
            a.add(new ArrayList<Integer>());
        }
        a.get(level-1).add(root.val);
        level++;
        levelOrder(root.left);
        levelOrder(root.right);
        level--;

        return a;
    }

}