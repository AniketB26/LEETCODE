class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int length=0;
        for(int i = n-1; i>=0; i--){
            if(arr[i] == ' ' && length == 0) continue;
            else if(arr[i] != ' ') length++;
            else break;
        }

        return length;

    }
}