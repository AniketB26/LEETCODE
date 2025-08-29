class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int ti = 0;
        int ni = 1;
        while(ni <= n && ti<target.length ){
            list.add("Push");
            if(ni == target[ti]){
                ti++;
                
                
            }
            else{
                list.add("Pop");
            }

            ni++;
        }

        return list;
    }
}