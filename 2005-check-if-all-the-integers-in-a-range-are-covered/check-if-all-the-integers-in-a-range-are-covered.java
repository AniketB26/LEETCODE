class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        
        int max = -1;
        for(int[] x : ranges){
            max = Math.max(max,x[1]);

        }

        int[] arr = new int[max+1];


        for(int[] x: ranges){

           arr[x[0]]++;

            if(x[1] + 1 < arr.length)
                arr[x[1] + 1]--;
        }

        int[] prefix = new int[max+1];

        prefix[0] = arr[0];

        for(int i=1; i<prefix.length; i++){

            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.println(max);
        if(max < right) return false;
        for(int i = left; i<=right; i++){

            if(prefix[i] == 0) return false;
        }

        return true;
    }
}