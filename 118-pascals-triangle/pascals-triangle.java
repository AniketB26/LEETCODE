class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        // for(int i =0; i< numRows; i++){
        //     List<Integer> ll = new ArrayList<>();
           
        //     for(int j =0; j <=i; j++){
                
        //        if(j == 0 || j == i){
        //         ll.add(1);
        //        }
        //        else{
        //         int val = list.get(i-1).get(j-1) + list.get(i-1).get(j);
        //         ll.add(val);
        //        }

                
        //     }

        //     list.add(ll);
        // }


        for(int n = 0; n<numRows; n++){
            List<Integer> row = new ArrayList<>();
            long val = 1;
            for(int k = 0; k<=n ; k++){

                row.add((int)val);
                val = val*(n-k)/(k+1);
            }

            list.add(row);
        }

        return list;
    }
}