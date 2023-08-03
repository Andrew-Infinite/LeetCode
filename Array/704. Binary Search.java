class Solution {
    public int search(int[] nums, int target) {
        int lo=0,hi=nums.length-1,mid = (hi+lo)/2;
        while(lo<=hi){
            if(nums[mid]>target){
                hi = mid - 1;
            }else if(nums[mid]<target){
                lo = mid + 1;
            }else{
                return mid;
            }
            mid = (hi+lo)/2;
        }
        return -1;
    }
}