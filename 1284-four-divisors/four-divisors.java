class Solution {

    public int sumFourDivisors(int[] nums) {

        int ans = 0;

        for(int n : nums){

            ans += fourdivisor(n);
        }

        return ans;

    }

    private int fourdivisor(int n){

        int d = -1;

        for(int i =2; i*i <= n ; i++){

            if(n%i==0){
                d = i;
                break;
            }
        }

        if(d == -1) return 0;


        int other = n/d;

        if(other % d == 0){
            int q = other / d;


            if( q==d && isPrime(d)){

                return 1 + d + d*d + n;
            }

            return 0;
        }


        if(isPrime(d) && isPrime(other)){

            
                return 1 + d + other + n;
            

        }

        return 0;



    }


    private boolean isPrime(int n){

        if(n < 2) return false;

        for(int i =2; i*i<= n; i++){

            if(n%i==0) return false;
        }

        return true;
    }
}