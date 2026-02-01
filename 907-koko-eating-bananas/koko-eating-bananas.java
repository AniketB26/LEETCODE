class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high =0;

        for(int n : piles){
            high = Math.max(high,n);
        }
        int ans = high;

        while(low<=high){

            int mid = low + (high - low)/2;

            if(caneat(piles, h, mid)){
                ans = mid;
                high = mid -1;

            }
            else{
                low = mid+1;
            }
        }
        return ans;
    
    }

    boolean caneat(int[] piles, int h , int speed){
        long hh = 0;
        for(int n : piles){
            hh += (n+speed-1)/speed;
             if (hh > h) return false;
        }

        return hh <= h;
    }
}