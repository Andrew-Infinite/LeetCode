class Solution {
    public int swap(int num){
        int swapped=0;
        while(num>0){
            int temp = num%10;
            swapped = swapped*10 + temp;
            num=num/10;
        }
        return swapped;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else if(x<10){
            return true;
        }else{
            if(x == swap(x)){
                return true;
            }
            return false;
        }
    }
}