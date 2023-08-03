int removeDuplicates(int* nums, int numsSize){
    int lastNewElement=nums[0];
    int emptyLocation=1;
    int count=1;
    for(int i=1;i<numsSize;i++){
        if(lastNewElement!=nums[i]){
            count++;
            lastNewElement=nums[i];
            nums[emptyLocation]=lastNewElement;
            emptyLocation++;
        }
    }
    return count;
}

/*
1)rmb last new element
2)remember last empty location
3)swap element to last empty location
4)rmb count
*/