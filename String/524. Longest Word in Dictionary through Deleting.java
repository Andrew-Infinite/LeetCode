class Solution {
    Comparator<String> customcmp = new Comparator<String>()
    {
        public int compare(String s1, String s2) {
            if(s1.length() != s2.length())
            {
                return s2.length() - s1.length();
            }
            return s1.compareTo(s2);
        }
    };
    public String findLongestWord(String s, List<String> dictionary)
    {
        Collections.sort(dictionary,customcmp);
        for(String x : dictionary)
        {
            int i = 0; int j = 0;
            while(i < x.length() && j < s.length())
            {
                if(x.charAt(i) == s.charAt(j))
                {
                    i++;
                }
                j++;
            }
            if(i == x.length())
            {
                return x;
            }
        }
        return "";
    }
}
