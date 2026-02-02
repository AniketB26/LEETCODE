class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int r =0;
        int ans = 0;

        for(int i=0; i< weights.length; i++){
            r += weights[i];
        }

        while(l<=r){
            int mid = l+ (r-l)/2;

            if(helper(weights, days, mid)){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    boolean helper(int[] wt, int d, int min){

        int days = 1;
        int load = 0;

        for(int w : wt){

            if(w > min){
                return false;
            }


            if(load + w > min){
                days++;
                load = w;
            }

            else{
                load += w;
            }
        }

        return days <= d;
    }
}