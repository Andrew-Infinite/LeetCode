int searchInsert(int* nums, int numsSize, int target){
    int hi = numsSize-1;
    int lo = 0;
    int mid = (hi+lo)/2;
    if(target<nums[0]){
        return 0;
    }
    while(lo<=hi){
        if(target<nums[mid]){
            hi=mid-1;
        }else if(nums[mid]<target){
            lo=mid+1;
        }else{
            return mid;
        }
        mid = (hi+lo)/2;
    }
    return mid+1;
}