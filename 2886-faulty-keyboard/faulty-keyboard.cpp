class Solution {
public:
    string finalString(string s) {
        string k = "";

        for(char i : s){
            if(i=='i'){
                reverse(k.begin(), k.end());
            }
            else{
                k += i;
            }
        }

        return k;
    }
};