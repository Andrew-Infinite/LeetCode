class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<(nums.length-1);i++){
            int n2 = target-nums[i];
            if(map.containsKey(n2)&&i!=map.get(n2)){
                answer[0]=i;
                answer[1]=map.get(n2);
                map.remove(nums[i]);
                map.remove(n2);
            }
        }
        System.out.print(answer[1]);
        return answer;
    }
}