class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()) return "";

        Map<Character, Integer> swala = new HashMap<>();
        Map<Character, Integer> twala = new HashMap<>();

        for(char c: t.toCharArray()){
            twala.put(c, twala.getOrDefault(c,0)+1);
        }


        int left = 0, start =0;
        int minlen = Integer.MAX_VALUE;
        int need = twala.size() , have =0;



        for(int right =0; right < s.length(); right++){

            char c = s.charAt(right);

            swala.put(c, swala.getOrDefault(c,0)+1);


            if(twala.containsKey(c) && 
                swala.get(c).intValue() == twala.get(c).intValue()
            ){
                have++;
            }


            while(have == need){

                if(right - left +1 < minlen){
                    minlen = right-left+1;
                    start = left;
                }


                char leftchar = s.charAt(left);

                swala.put(leftchar, swala.getOrDefault(leftchar,0)-1);


                if(twala.containsKey(leftchar) &&
                    swala.get(leftchar).intValue() < twala.get(leftchar).intValue()
                ){
                    have--;
                }

                left++;

            }
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}