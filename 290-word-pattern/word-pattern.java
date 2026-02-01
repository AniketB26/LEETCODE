class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if (ss.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();

        for(int i =0; i<ss.length; i++){
            char c = pattern.charAt(i);
            String w = ss[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(w)) return false;
            }
            else{
                if(used.contains(w)) return false;

                map.put(c,w);
                used.add(w);
            }
        }

        return true;
    }
}