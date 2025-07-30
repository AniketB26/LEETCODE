class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);

        while(arr.size() < n){

            List<Integer> temp = new ArrayList<>();

            for(int num : arr){
                if(2*num -1 <=n){
                    temp.add(2*num-1);
                }
            }

            for(int num : arr){
                if(2*num <= n){
                    temp.add(2*num);
                }
            }

            arr = temp;
        }


        int[] fin = new int[n];

        for(int i =0; i<n ; i++){
            fin[i] = arr.get(i);
        }

        return fin;
    }
}