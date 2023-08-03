class Solution {
public:
    int strStr(string haystack, string needle) {
        char firstOfNeedle=needle[0];
        int len2 = needle.length()-1;
        int len = haystack.length()-len2;
        for(int i=0;i<len;i++){
            if(haystack[i]==firstOfNeedle){
                for(int j=0;j<=len2;j++){
                    if(haystack[i+j]!=needle[j]){
                        break;
                    }else if(j==len2){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
};