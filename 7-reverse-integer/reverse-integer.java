class Solution {
    public int reverse(int x) {
        int re = 0;
        while(x != 0){
            int digit = x%10;
            if(re > Integer.MAX_VALUE/10 || (re == Integer.MAX_VALUE/10 && digit > 7 )) return 0;
            if(re < Integer.MIN_VALUE/10 || (re == Integer.MAX_VALUE/10 && digit < -8)) return 0;

            re = re*10 + digit;
            
            x /= 10;
        }

        return re;
    }
}