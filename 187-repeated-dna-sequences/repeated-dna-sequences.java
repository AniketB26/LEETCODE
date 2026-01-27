class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();


        Set<String> seen = new HashSet<>();
        Set<String> dup = new HashSet<>();

        for(int i=0; i<=s.length() -10; i++){

            String sub = s.substring(i,i+10);

            if(!seen.contains(sub)){
                seen.add(sub);
            }
            else{
                dup.add(sub);
            }
        }


        ans.addAll(dup);

        return ans;
    }
}