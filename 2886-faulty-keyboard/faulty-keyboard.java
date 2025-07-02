class Solution {
    
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch =='i'){
                str.reverse();
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}