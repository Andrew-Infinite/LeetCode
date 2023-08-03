class Solution {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public int tribonacci(int n) {
        if(n<2){
            return n;
        }else if(n==2){
            return 1;
        }
        if(!map.containsKey(n)){
            map.put(n,tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
        }
        return map.get(n);
    }
}