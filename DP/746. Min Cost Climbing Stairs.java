class Solution {
    int TotalCost[];
    public int minCostClimbingStairs(int[] cost) {
        TotalCost = new int[cost.length];
        TotalCost[0]=cost[0];
        TotalCost[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            TotalCost[i]=Math.min(TotalCost[i-1],TotalCost[i-2])+cost[i];
        }
        return Math.min(TotalCost[cost.length-1],TotalCost[cost.length-2]);
    }
}