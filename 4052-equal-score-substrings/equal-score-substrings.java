class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        long[] presum = new long[n];
       

        long constant = 'a' - 1L;
         presum[0] = s.charAt(0) - constant;
        for (int i = 1; i < n; i++) {
            
                presum[i] = presum[i-1] + (s.charAt(i) - constant);
            
            
        }

        

        long x = presum[n - 1];

        if(x%2 != 0){
            System.out.println(x);
            return false;

        } 

        for (int i = 0; i < n; i++) {
            if (presum[i] == x/2) return true;
        }

        return false;
    }
}
