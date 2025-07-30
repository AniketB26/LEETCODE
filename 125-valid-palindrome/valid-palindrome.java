class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(c);
            }
        }

        s = str.toString();
        String ss = str.reverse().toString();

        return s.equals(ss);
    }
}