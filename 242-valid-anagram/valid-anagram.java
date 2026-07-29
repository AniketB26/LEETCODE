class Solution {
    public boolean isAnagram(String s, String t) {
        int[] swala = new int[26];
        int[] twala = new int[26];

        int n = s.length();
        int m = t.length();

        if(n != m) return false;


        for(int i =0; i<n ; i++){

            char x = s.charAt(i);
            char y = t.charAt(i);

            swala[x-'a']++;
            twala[y-'a']++;
        }


        for(int i =0; i<26; i++){

            if(swala[i] != twala[i]) return false;
        }

        return true;
    }
}