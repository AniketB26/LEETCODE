class Solution {
    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");

        StringBuilder res = new StringBuilder();


        for(int i = ss.length -1; i >= 0 ; i--){


            
            res.append(ss[i]);
            
            
            
            if( i != 0) res.append(" ");
            
        }

        return res.toString();
    }
}