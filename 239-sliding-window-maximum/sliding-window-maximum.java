class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // List<Integer> list = new ArrayList<>();
        int n = nums.length;
        
        // for(int i=0; i< n-k+1 ; i++){
        //     int max = Integer.MIN_VALUE;

        //     int j = i;

        //     while( j< n && j-i+1 <= k){
        //         if(nums[j] > max){
        //             max = nums[j];
        //         }
        //         j++;
        //     }

        //     list.add(max);
        // }

        // int[] res = new int[list.size()];
        // int t =0;
        // for(int s : list){
        //     res[t] = s;
        //     t++;
        // }


        // return res;

        
        int i =0, j =0;
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[n-k+1];
        int idx = 0;

        while(j<n){

            while(!dq.isEmpty() && dq.peekLast() < nums[j]){
                dq.pollLast();
            }

            dq.offer(nums[j]);

            if(j-i+1 < k){
                j++;
            }

            else if(j-i+1 == k){
                res[idx++] = dq.peekFirst();

                if(dq.peekFirst() == nums[i]){
                    dq.pollFirst();
                }

                i++;
                j++;
            }
        }

        return res;
    }
}