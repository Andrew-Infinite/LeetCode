class Solution {
public:
    bool isValid(string s) {
        char temp;
        stack <char> myList;
        for(int i = 0;s[i]!='\0';i++){
            if(s[i]=='('||s[i]=='['||s[i]=='{'){
                myList.push(s[i]);
            }else{
                if(myList.empty()){
                    return false;
                }else{
                    temp = myList.top();
                    myList.pop();
                }
                if(temp == '(' && s[i] == ')'){/*do nothing*/}
                else if(temp == '{' && s[i] == '}'){/*do nothing*/}
                else if(temp == '[' && s[i] == ']'){/*do nothing*/}
                else{
                    return false;
                }
            }
        }
        if(!myList.empty()){
            return false;
        }
        return true;
    }
};