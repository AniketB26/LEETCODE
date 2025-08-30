class Solution {
    public int firstUniqChar(String s) {
    //     HashMap<Character,int[]> map = new HashMap<>();

    //     char[] arr = s.toCharArray();

    //     for(int i =0; i<arr.length; i++){
    //         if(!map.containsKey(arr[i])){
    //             map.put(arr[i], new int[]{1,i});
    //         }
    //         else{
    //             map.get(arr[i])[0]++;
    //         }
    //     }

        

    //     int min = Integer.MAX_VALUE;
        
    //     for(char x : map.keySet()){
    //         int freq = map.get(x)[0];
    //         int val = map.get(x)[1];
    //         if(freq == 1){
    //             min = Math.min(min,val);
    //         }
            
            
    //     }

    //    return (min == Integer.MAX_VALUE) ? -1 : min;

        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] freq = new int[256];


        for(int i =0; i<n; i++){
            freq[arr[i]]++;
        }

        for(int i =0; i<n; i++){
            if(freq[arr[i]] == 1) return i;
        }


        return -1;

    }
}