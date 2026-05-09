class Solution {

    int helper(int n, int[] cnt, int st){

        if(cnt[st] != 0) return cnt[st];

        if(st == 0) return 0;
        if(st == 1 || st == 2) return 1;

        int one = helper(n, cnt, st-1);
        int two = helper(n, cnt, st-2);
        int three = helper(n,cnt, st-3);

        cnt[st] = one+two+three;

        return cnt[st];


    }

    public int tribonacci(int n) {

        int[] cnt = new int[n+1];
        int st =n;

        return helper(n, cnt, st );
    }
}