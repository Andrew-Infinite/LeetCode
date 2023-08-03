class Solution {
    int arr[][];
    public int maxSubArray(int[] nums) {
        //arr = new int[nums.length][nums.length];
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>sum+nums[i]){
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}