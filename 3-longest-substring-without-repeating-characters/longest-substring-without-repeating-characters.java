class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int r =0, l=0, max =0;

        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                max = Math.max(max, r-l);
            }
            else{
                set.remove(s.charAt(l));
                l++;

            }
        }

        return max;
    }
}