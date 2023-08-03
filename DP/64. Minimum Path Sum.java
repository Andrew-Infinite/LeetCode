class Solution {
    int[][] arr;
    public int minPathSum(int[][] grid) {
        arr=new int[grid.length][grid[0].length];
        return helper(grid,grid.length-1,grid[0].length-1);
    }
    public int helper(int[][] grid,int i ,int j){
        if(arr[i][j]!=0){
            //do nothing
        }else if(i==0&&j==0){
            arr[i][j] = grid[i][j]+1;
        }else if(i==0){
            arr[i][j] = helper(grid,i,j-1) + grid[i][j]+1;
        }else if(j==0){
            arr[i][j] = helper(grid,i-1,j) + grid[i][j]+1;
        }else{
            arr[i][j] = grid[i][j]+Math.min(helper(grid,i-1,j),helper(grid,i,j-1))+1;
        }
        return arr[i][j]-1;

        
    }
}