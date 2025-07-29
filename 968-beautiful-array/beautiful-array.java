class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> list = new ArrayList<>();


        list.add(1);

        while(list.size() < n){
            List<Integer> temp = new ArrayList<>();


            for(int num : list){
                if(2*num -1 <= n){
                    temp.add(2*num-1);
                }
            }

            for(int num : list){
                if(2*num <= n){
                    temp.add(2*num);
                }
            }

            list = temp;
        }

        int[] fin = new int[n];

        for(int i =0; i<n; i++){
            fin[i] = list.get(i);
        }


        return fin;
    }
}