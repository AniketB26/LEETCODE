class Solution {
    public long removeZeros(long n) {
        // StringBuilder sb = new StringBuilder(String.valueOf(n));

        // for(int i =0; i< sb.length(); i++){
        //     if(sb.charAt(i)=='0'){
        //         sb.deleteCharAt(i);
        //         i--;
        //     }
        // }

        // long nn = Long.parseLong(sb.toString());

        // return nn;

        long res = 0;
        long pl = 1;

        while(n>0){
            long dig = n%10;

            if(dig != 0){
                res += dig * pl;
                pl *=10;
            }
            n = n/10;

        }

        return res;
    }
}