class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int lo=0;
        int hi=nums.size()-1;
        int mid=(lo+hi)/2;
        while(lo<=hi){
            if(nums[mid]>target){
                hi=mid-1;
            }else if(nums[mid]<target){
                lo=mid+1;
            }else if(nums[mid]==target){
                return mid;
            }
            mid=(lo+hi)/2;
        }
        return lo;
    }
};