class Solution {
    public int strStr(String haystack, String needle) {
        int[] lps = BuildLPS(needle);
        char[] str = haystack.toCharArray();
        char[] ptt = needle.toCharArray();
        int i =0, j=0;
        while(i<haystack.length()){
            if(str[i] == ptt[j]){
                i++;
                j++;
            }
            if(j==ptt.length) return i-j;
            
            else if(i<str.length && str[i] != ptt[j]){
                if(j!=0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;
       
    }

    public int[] BuildLPS(String s){
        char[] str = s.toCharArray();
        int [] lps = new int[s.length()];
        int i =0, j =1;

        while(j<s.length()){
            if(str[i]== str[j]){
                lps[j] = i+1;
                i++;
                j++;
            }
            else{
                if(i==0){
                    lps[j] = 0;
                    
                    j++;
                }
                else{
                    i = lps[i-1];
                }
            }
        }
        return lps;

    }
}