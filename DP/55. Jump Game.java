class Solution {
    public boolean canJump(int[] nums) {
        int furthest = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(i<=furthest){
                furthest = Math.max(nums[i]+i,furthest);
            }
        }
        return (nums.length-1<=furthest);
    }
}