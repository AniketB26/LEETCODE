class Solution {
    public int minCut(String s) {
        int n = s.length();

        boolean[][] ispal = new boolean[n][n];


        for(int gap = 0; gap<n; gap++){
            for(int i =0, j=gap; j<n; i++,j++){

                if(gap==0){
                    ispal[i][j] = true;
                }
                else if(gap == 1){
                    ispal[i][j] = (s.charAt(i) == s.charAt(j) );

                }
                else{
                    ispal[i][j] =
                    (s.charAt(i) == s.charAt(j)) &&
                    ispal[i + 1][j - 1];
                }


            }
        }


        int[] cuts = new int[n];

        for(int i =0; i<n; i++){

            if(ispal[0][i]){
                cuts[i] = 0;
            }
            else{
                int min = Integer.MAX_VALUE;

                for(int j =0; j<i ; j++){

                    if(ispal[j+1][i]){
                        min = Math.min(min, cuts[j] +1);
                    }
                }

                cuts[i] = min;
            }
        }

        return cuts[n-1];
    }
}