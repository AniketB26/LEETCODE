class Solution {
    public int earliestTime(int[][] tasks) {
        
        int min = Integer.MAX_VALUE;

        for(int i =0; i< tasks.length; i++){
            int temp =0;
            for(int j =0; j< 2; j++){
                temp += tasks[i][j];
            }

            if(min > temp ) min = temp;
        }

        return min;
    }
}