class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int add=1;
        int index = digits.size()-1;
        
        
        if(digits[index]<9){
            digits[index]++;
            return digits;
        }
        int i=0;
        while(i<=index&&digits[i]==9){
            i++;
        }
        if(i>index){
            digits[0]=1;
            for(int j=1;j<=index;j++){
                digits[j]=0;
            }
            digits.push_back(0);
            return digits;
        }
        while(add==1){
            if(digits[index]==9){
                digits[index]=0;
                index--;
            }else{
                digits[index]++;
                add=0;
            }
        }
        return digits;
        
    }
};