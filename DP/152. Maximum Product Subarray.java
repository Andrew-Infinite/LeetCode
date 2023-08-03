class Solution {
    int max=Integer.MIN_VALUE;
    public int maxProduct(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            int subMax = Integer.MIN_VALUE;
            int subInit = 1;
            for(int j = i; j<nums.length; j++){
                subInit *= nums[j];
                if(subMax<subInit) subMax = subInit;
            }
            if(max<subMax) max = subMax;
        }
        return max;
    }
}