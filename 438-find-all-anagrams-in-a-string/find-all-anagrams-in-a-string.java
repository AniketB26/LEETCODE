class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];

        for(char c : p.toCharArray()){
            int idx = c - 'a';

            freq[idx]++;
        }

        
        int left =0, right = 0, cnt=p.length();
        List<Integer> res = new ArrayList<>();

        while(right< s.length()){

            if(freq[s.charAt(right) - 'a'] > 0){
                cnt--;
            }

            freq[s.charAt(right) - 'a']--;
            right++;


            if(cnt==0){
                res.add(left);
            }

            if(right-left == p.length()){

                if(freq[s.charAt(left) - 'a'] >= 0){
                    cnt++;
                }

                freq[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return res;
    }
}