class Solution {
    public boolean canConstruct(String r, String m) {
        int[] arr = new int[26];

        for(char i : r.toCharArray()){
            arr[i-'a']++;
        }
        for(char i : m.toCharArray()){
            if(arr[i-'a']>0){
                
            arr[i-'a']--;
            }
        }

        for(int i =0; i<26; i++){
            if(arr[i]>0){
                return false;
            }
        }

        return true;
       
    }
}