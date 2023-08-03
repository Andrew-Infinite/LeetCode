int removeElement(int* nums, int numsSize, int val){
    int count=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]!=val){
            nums[count]=nums[i];
            count++;
        }
    }
    return count;
}

/*
1)find num that = val
2)rmb location of val (queue)
3)
*/