class Solution {
    // int helper(int[] energy, int i , int k, int n){
    //     if(i+k > n-1) return energy[i];

    //     if(i+k == n-1) return energy[i] + energy[n-1];
    //     int ene = 0;

    //     for(int j = i; j<n ; j += k){
    //         ene += energy[j];
             
    //     }

    //     return ene;
    // }
    public int maximumEnergy(int[] energy, int k) {
        
        int n = energy.length;
        int maxx = Integer.MIN_VALUE;

        // for(int i =0; i< n ; i++){

        //     int temp = helper(energy, i, k, n);

        //     if(temp > maxx ) maxx = temp;
        // }

        // return maxx;

        for(int r =0; r<k ; r++){

            int suff = 0;

            for(int i= r + ((n-1-r)/k)*k ; i>=0 ; i -= k){
                suff += energy[i];

                maxx = Math.max(maxx, suff);
            }
        }

        return maxx;
    }
}