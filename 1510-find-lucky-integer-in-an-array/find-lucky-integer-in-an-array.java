class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i =0;

        while(i<arr.length){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            i++;
        }
        int max = -1;
        for(int x: map.keySet()){

            if(x == map.get(x)){
                max = x;
            }
        }

        return max;
    }
}