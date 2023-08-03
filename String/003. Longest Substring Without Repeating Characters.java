class Solution {
    int hash[] = new int[128];
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int maxLength=0;
        int lo = 0;
        hash[s.charAt(0)]=1;
        int hi;
        for(hi = 0;hi < s.length();hi++){
            if(lo==hi){
                continue;
            }
            if(hash[s.charAt(hi)]>=lo+1){
                maxLength = (maxLength > hi-lo)?maxLength:hi-lo;
                lo=hash[s.charAt(hi)];
            }
            hash[s.charAt(hi)] = hi+1;
        }
        maxLength = (maxLength > hi-lo)?maxLength:hi-lo;
        return maxLength;
    }
}