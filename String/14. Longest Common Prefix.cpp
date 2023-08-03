class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs.size()==1){
            return strs[0];
        }
        string a="";
        bool haveUncommon=false;
        int len=strs[0].length();
        //find shorter length
        for(int i=1;i<strs.size();i++){
            if(strs[i].length()<len){
                len=strs[i].length();
            }
        }
        
        for(int j=0;j<len&&!haveUncommon;j++){
            char test=strs[0][j];
            for(int i=1;i<strs.size();i++){
                if(strs[i][j]!=test){
                    haveUncommon=true;
                    break;
                }else if(i==strs.size()-1){
                    a+=strs[0][j];
                }
            }
        }
        return a;
    }
};