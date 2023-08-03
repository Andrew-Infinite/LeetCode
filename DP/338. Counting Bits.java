class Solution {
    int[] arr;
    public int[] countBits(int n) {
        arr=new int[n+1];
        for(int i=n;i>0;i--){
            helper(i);
        }
        return arr;
    }
    public int helper(int n){
        if(arr[n]==0&&n!=0){
            arr[n]=helper(n>>1)+n%2;
        }
        return arr[n];
    }
}