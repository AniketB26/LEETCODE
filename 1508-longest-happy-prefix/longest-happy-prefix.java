class Solution {
    public String longestPrefix(String s) {
        int[] lsp = new int[s.length()];

        int len=0;
        int i = 1;

        while(i<s.length()){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lsp[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lsp[len-1];
                }
                else{
                    lsp[i] =0;
                    i++;
                }
            }
        }

        return s.substring(0,lsp[s.length()-1]);
    }
}