class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> ans;
        ans.push_back(0);
        if(n==0){
            return ans;
        }
        ans.push_back(1);
        int upper=2;
        int Now=0;
        int j=0;
        for(int i=2;i<=n;i++){
            Now=ans[j]+1;
            ans.push_back(Now);
            if(Now==upper){
                upper++;
                j=0;
            }else{
                j++;
            }
        }
        return ans;
    }
};