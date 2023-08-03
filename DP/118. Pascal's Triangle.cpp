class Solution {
public:
    
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> answer;
        for(int i=1;i<=numRows;i++){
            vector<int> temp;
            temp.reserve(i);
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    temp.push_back(1);
                }else{
                    temp.push_back(answer[(i-1)-1][j-1]+answer[(i-1)-1][j-2]);
                }
            }
            answer.push_back(temp);
        }
        return answer;
    }
};