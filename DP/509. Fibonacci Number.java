class Solution {
    HashMap<Integer,Integer> x = new HashMap<Integer,Integer>();
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n<=2){
            return 1;
        }else if(!x.containsKey(n)){
            x.put(n,fib(n-1) + fib(n-2));
        }
        return x.get(n);
    }
}