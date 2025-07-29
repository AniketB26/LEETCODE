class Solution {
    public int similarPairs(String[] words) {
        Map<Integer, Integer> map = new HashMap<>();

        for(String word : words){
            int mask = 0;

            for(char c : word.toCharArray()){
                mask |= 1 << (c - 'a');
            }

            map.put(mask,map.getOrDefault(mask,0)+1);
        }

        int cnt =0;

        for(int freq : map.values()){
            if(freq > 1){
                cnt += (freq * (freq -1))/2;
            }
        }

        return cnt;
    }
}