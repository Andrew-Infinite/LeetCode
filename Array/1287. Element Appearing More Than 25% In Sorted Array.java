class Solution {
    public int findSpecialInteger(int[] arr) {
        double CountThreshold = (double)arr.length/4.0;
        int Count = 0;
        int Now = 0;
        for(int x:arr){
            if(x == Now){
                Count++;
            }else{
                Count=1;
                Now = x;
            }
            if(CountThreshold<Count){
                return x;
            }
        }
        return -1;
    }
}