class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        
        int cnt = 1;

        while(n != 0){
            int di = n%10;
            if(di !=0){
                arr.add(di*cnt);
            }
            
            cnt = cnt *10;
            n = n/10;
        }

        int[] res = new int[arr.size()];

        for(int i =0; i<res.length ; i++){
            res[i] = arr.get(arr.size()-i-1);
        }

        return res;
    }
}