class Solution {
    public int possibleStringCount(String word) {
        char[] arr = word.toCharArray();
        int n = arr.length;
        int cnt = 1;
        int i =0, j= 1;
        while(j<n){
            if(arr[i] == arr[j]){
                cnt++;
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return cnt;
    }
}