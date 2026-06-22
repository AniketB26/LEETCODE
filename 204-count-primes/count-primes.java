class Solution {
    boolean checkPrime(int n){

        for(int i =2; i*i <= n; i++){

            if(n%i==0) return false;
        }

        return true;
    }
    public int countPrimes(int n) {
        boolean[] seive = new boolean[n];

        for(int i = 2; i<n; i++) seive[i] = true;

        for(int i =2; i*i<n; i++){

            if(seive[i]){

                for(int j = i*i; j<n ; j+= i){

                    seive[j] = false;
                }
            }
        }

        int cnt = 0;

        for(int i =2; i<n ; i++){

            if(seive[i]) cnt++;
        }

        return cnt;



    }
}