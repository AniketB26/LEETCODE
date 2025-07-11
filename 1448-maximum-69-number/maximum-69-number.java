class Solution {
    public int maximum69Number (int num) {
        StringBuilder str = new StringBuilder(String.valueOf(num));
        int i =0;
        while(i < str.length()){
            if(str.charAt(i)=='6'){
                str.setCharAt(i, '9');
                break;
            }
            i++;
        }
        
        return Integer.valueOf(str.toString());
    }
}