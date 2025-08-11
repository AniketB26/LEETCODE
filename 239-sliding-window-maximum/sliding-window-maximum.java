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

        
        Deque<Integer> q = new LinkedList<>();
        int[] ls = new int[n-k+1];
        int idx = 0;
        
        for(int i =0; i<n ; i++){

            if(!q.isEmpty() && q.peekFirst() <= i-k){
                q.pollFirst();
            }

            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }

            q.offerLast(i);

            if(i >= k-1){
                ls[idx++] = nums[q.peekFirst()];
            }
        }


        

       return ls;
    }
}