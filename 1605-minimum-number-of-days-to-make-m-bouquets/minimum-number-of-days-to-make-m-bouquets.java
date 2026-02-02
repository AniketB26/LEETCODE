class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1;
        int high = 0;
        int ans = -1;

        for(int n : bloomDay){
            high = Math.max(high,n);
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            if(helper(bloomDay, m, k, mid)){
                ans = mid;
                high = mid-1;
            }

            else{
                low = mid+1;
            }
        }
        return ans;
    }


    boolean helper(int[] bloomDay, int m, int k, int day){

        int b = 0;
        int c = 0;


        for(int  x : bloomDay){

            if(x <= day){
                c++;

                if(c == k){
                    b++;
                    c = 0;

                    if(b == m) return true;
                }
            }
            else{
                c=0;
            }
        }

        return b >= m;
    }
}