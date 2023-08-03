class Solution {
    HashMap<Integer,Integer> x = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        if(n<4){
            return n;
        }else if(!x.containsKey(n)){
            x.put(n,climbStairs(n-1) + climbStairs(n-2));
        }
        return x.get(n);
    }
}
