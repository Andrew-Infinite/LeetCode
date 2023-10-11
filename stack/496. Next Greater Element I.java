class Solution {
    Stack<Integer> stack = new Stack<Integer>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++)
        {
            map.put(nums1[i],i);
            nums1[i] = -1;
        }
        for(int i = 0;i < nums2.length;i++){
            while(!stack.isEmpty() && stack.peek() < nums2[i])
            {
                nums1[map.get(stack.peek())] = nums2[i];
                stack.pop();
            }
            if(map.containsKey(nums2[i]))
            {
                stack.push(nums2[i]);
            }
        }
        return nums1;
    }
}
