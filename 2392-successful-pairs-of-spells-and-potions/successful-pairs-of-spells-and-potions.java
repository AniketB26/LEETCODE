class Solution {

    int search(int x, int[] pp, long ss){
        int first = pp.length;
        int left = 0;
        int right = pp.length -1 ;

        while(left <= right){
            int mid = (left+right)/2;
            long pro = (long)pp[mid] * x;
            if(pro>= ss){
               first = mid;
               right = mid-1;

            }
            else{
                left = mid + 1;
            }


        } 

        return pp.length - first;
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        
        for(int i =0; i< spells.length; i++){
            int x = spells[i];
            
            res[i] = search(x, potions, success);

           
        }

        return res;


    }



}