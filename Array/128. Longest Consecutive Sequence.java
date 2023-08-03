class Solution {
    HashSet<Integer> numberList = new HashSet<Integer>();
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        for(int x:nums){
            numberList.add(x);
        }
        int max = 1;
        for(int i = 0;i<nums.length;i++){
            int temp = nums[i];
            int localmax = 1;
            while(numberList.contains(temp+1)){
                temp++;
                localmax++;
                numberList.remove(temp);
            }
            temp = nums[i];
            while(numberList.contains(temp-1)){
                temp--;
                localmax++;
                numberList.remove(temp);
            }
            max = (localmax>max) ? localmax : max;
        }
        return max;
    }
}