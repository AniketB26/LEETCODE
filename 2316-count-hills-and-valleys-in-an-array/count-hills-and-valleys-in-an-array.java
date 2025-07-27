class Solution {
    public int countHillValley(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        list.add(nums[0]);

        for(int i =1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                list.add(nums[i]);
            }
        }

        int i = 1;
        int j = 2;
        int cnt =0;


        while(j < list.size()){
            if(list.get(i-1) < list.get(i) && list.get(i) > list.get(j)){
                cnt++;
            }
            else if(list.get(i-1) > list.get(i) && list.get(i) < list.get(j)){
                cnt++;
            }
            
            i++;
            j++;
        }

        return cnt;
    }
}