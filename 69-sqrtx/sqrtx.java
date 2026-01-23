class Solution {
    public int mySqrt(int x) {

        if(x < 2 ) return x;
        
        int l =1;
        int r = x/2;

        int mid = -1;

        while(l<= r){
            mid = (l+r)/2;

            long sq = (long) mid*mid;

            if(sq == x){
                return mid;
            }

            if(sq < x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return r;
    }
}