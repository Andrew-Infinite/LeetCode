class Solution {
    public boolean isAnagram(String s, String t) {
        int codeHash[] = new int['z' - 'a' + 1];

        for(char x : s.toCharArray()){
            codeHash[x-'a']+=1;
        }
        for(char x : t.toCharArray()){
            codeHash[x-'a']-=1;
        }
        for(int a : codeHash){
            if(a!=0){return false;}
        }
        return true;
    }
}