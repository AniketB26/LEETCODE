class Solution {
    public String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        StringBuilder res = new StringBuilder();
        int i = aa.length - 1, j = bb.length - 1, carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;

            if(i>=0 ) sum += aa[i--] - '0';
            if(j >= 0) sum += bb[j--] - '0';

            res.append(sum % 2);

            carry = sum /2;
        }

        return res.reverse().toString();
    }
}