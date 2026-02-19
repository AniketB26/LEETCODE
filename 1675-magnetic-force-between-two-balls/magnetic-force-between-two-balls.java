class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int l = 1;
        int h = pos[pos.length-1] - pos[0];


       


       

        int ans =-1;


        while(l <= h){

            int mid = l+(h-l)/2;

            if(helper(pos, m, mid)){
                ans = mid;
                l = mid + 1;
            }
            else{
                h = mid-1;
            }
            
        }

        return ans;
    }

    boolean helper(int[] pos, int balls, int dist){

        int cnt = 1;
        int last = pos[0];

        for(int i =1; i<pos.length; i++){

            if(pos[i] - last >= dist){
                cnt++;
                last = pos[i];
            }

            if(cnt == balls) return true;


        }

        return cnt == balls;
    }
}