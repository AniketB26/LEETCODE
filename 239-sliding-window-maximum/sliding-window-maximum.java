class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // List<Integer> list = new ArrayList<>();
        
        
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

        int n = nums.length;
        int r =0, l =0;

        int[] ans = new int[n-k+1];
        int idx = 0;

        Deque<Integer> dq = new LinkedList<>();

        while(r<n){

            while(!dq.isEmpty() && dq.peekLast() < nums[r]){
                dq.pollLast();
            }

            dq.offer(nums[r]);

            if(r-l+1 < k) r++;

            else if(r-l+1 == k){
                ans[idx++] = dq.peekFirst();

                if(dq.peekFirst() == nums[l]){
                    dq.pollFirst();
                }

                r++;
                l++;
            }
        }

        return ans;

    }
}

// int i =0, j =0;
//         Deque<Integer> dq = new LinkedList<>();
//         int[] res = new int[n-k+1];
//         int idx = 0;

//         while(j<n){

//             while(!dq.isEmpty() && dq.peekLast() < nums[j]){
//                 dq.pollLast();
//             }

//             dq.offer(nums[j]);

//             if(j-i+1 < k){
//                 j++;
//             }

//             else if(j-i+1 == k){
//                 res[idx++] = dq.peekFirst();

//                 if(dq.peekFirst() == nums[i]){
//                     dq.pollFirst();
//                 }

//                 i++;
//                 j++;
//             }
//         }

//         return res;
