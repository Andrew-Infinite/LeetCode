class Solution {
public:
    int search(vector<int>& nums, int target) {
        int lo=0;int hi=nums.size()-1;
        int mid = (hi+lo)/2;
        while(lo<=hi){
            if(nums[mid]>target){
                hi=mid-1;
            }
            if(nums[mid]<target){
                lo=mid+1;
            }
            if(nums[mid]==target){
                return mid;
            }
            mid=(hi+lo)/2;
        }
        return -1;
        
    }
};