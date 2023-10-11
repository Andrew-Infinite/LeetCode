class Solution {
    void median(int[] nums, int lo, int pivot)
    {
        if(pivot - lo >= 2)
        {
            int mid = (pivot+lo)/2;
            if(nums[pivot] < nums[mid])
            {
                int temp = nums[pivot];
                nums[pivot] = nums[mid];
                nums[mid] = temp;
            }
            if(nums[pivot] > nums[lo])
            {
                int temp = nums[pivot];
                nums[pivot] = nums[lo];
                nums[lo] = temp;
            }
        }
    }
    int quickselect(int[] nums, int k, int lo, int hi)
    {
        median(nums,lo,hi);
        int pivot = hi;
        int lo2 = lo;
        int hi2 = hi - 1;
        while(lo2 < hi2)
        {
            if(nums[lo2] >= nums[pivot])
            {
                lo2++;
            }
            else if(nums[pivot] >= nums[hi2])
            {
                hi2--;
            }
            else
            {
                int temp = nums[lo2];
                nums[lo2] = nums[hi2];
                nums[hi2] = temp;
            }
        }
        if(nums[pivot] > nums[lo2]){
            int temp = nums[pivot];
            nums[pivot] = nums[lo2];
            nums[lo2] = temp;
            pivot = lo2;
        }

        if(pivot == (k-1))
        {
            return nums[k-1];
        }
        else if(pivot<(k-1))
        {
            return quickselect(nums,k,pivot+1,hi);
        }
        return quickselect(nums,k,lo,pivot-1);
    }
    public int findKthLargest(int[] nums, int k) {
        return quickselect(nums,k,0,nums.length - 1);
    }
}
