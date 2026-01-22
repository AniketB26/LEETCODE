class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
       int[] need = new int[26];
       int[] win = new int[26];

       
       int k = s1.length();

       for(int i =0; i<k; i++){
        char c = s1.charAt(i);


        need[c - 'a']++;
       }


       for(int i =0; i<s2.length(); i++){

        char c = s2.charAt(i);

        win[c-'a']++;

        if(i >= k) win[s2.charAt(i-k) - 'a']--;

        if(i >= k-1){
            if(match(need,win)) return true;
        }


       }


        return false;

        

    }


    boolean match(int[] a, int[] b){

        for(int i =0; i<26; i++){
            
            if(a[i] != b[i]) return false;
        }

        return true;
    }
}