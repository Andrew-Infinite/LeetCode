class Solution {
public:
    void MergeSort(vector<int>& nums,int lo, int hi){//hi is index,not length
        if(lo==hi){
            return;
        }
        int mid = (lo+hi)/2;
        MergeSort(nums,lo,mid);
        MergeSort(nums,mid+1,hi);
        merging(nums,lo,mid,hi);
    }
    void merging(vector<int>&nums,int lo, int mid, int hi){
        int rsize=hi-lo+1;
        int lsize=mid-lo+1;
        int temp[rsize];
        int i;
        
        for(i=0;i<rsize;i++){
            temp[i]=nums[i+lo];
        }
        
        i=lo;
        int leftIndex=0;int rightIndex=lsize;
        while(leftIndex<lsize&&rightIndex<rsize){
            if(temp[leftIndex]<temp[rightIndex]){
                nums[i]=temp[leftIndex];
                leftIndex++;
            }else{
                nums[i]=temp[rightIndex];
                rightIndex++;
            }
            i++;
        }
        while(leftIndex<lsize){
            nums[i]=temp[leftIndex];
            leftIndex++;
            i++;
        }
        while(rightIndex<rsize){
            nums[i]=temp[rightIndex];
            rightIndex++;
            i++;
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        MergeSort(nums,0,nums.size()-1);
        return nums;
    }
};