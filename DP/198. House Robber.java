class Solution {
    HashMap<Integer,Integer> x = new HashMap<Integer,Integer>();
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(rob(nums,nums.length-1),rob(nums,nums.length-2));
    }
    public int rob(int[] nums,int index){
        if(index==0||index==1){
            return nums[index];
        }
        if(index==2){
            return nums[2]+nums[0];
        }
        if(!x.containsKey(index-2)){
            x.put(
                index-2,
                rob(nums,index-2)
            );
        }
        if(!x.containsKey(index-3)){
            x.put(
                index-3,
                rob(nums,index-3)
            );
        }
        return Math.max(
            x.get(index-2),
            x.get(index-3)
        )+nums[index];
    }
}