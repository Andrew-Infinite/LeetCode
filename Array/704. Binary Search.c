int search(int* nums, int numsSize, int target){
    int lo = 0;
    int hi = numsSize-1;
    int mid = numsSize/2;
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
    return -1;
}