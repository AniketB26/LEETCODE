class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();


        HashSet<Integer> set = new HashSet<>();

        char[] arr = s.toCharArray();

        for(int i =0; i< s.length(); i++){
            if(arr[i] == '('){
                stk.push(i);
            }
            else if(arr[i] == ')'){
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else{
                    set.add(i);
                }
            }
            else{
                continue;
            }
        }

        while (!stk.isEmpty()) {
            set.add(stk.pop());
        }

        StringBuilder str = new StringBuilder(s);

        for(int i =s.length() -1; i>= 0; i--){
            if(set.contains(i)){
                str.deleteCharAt(i);
            }
        }

        return str.toString();
    }
}