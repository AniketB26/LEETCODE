class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(c);
            }
        }
        String ss = str.toString();
        String sr = str.reverse().toString();

        return ss.equals(sr); 
    }
}