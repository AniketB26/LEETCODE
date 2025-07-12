class Solution {
    public int countCollisions(String directions) {
        Stack<Character> stk = new Stack<>();
        int cnt = 0;
        
        for(char ch : directions.toCharArray()){
            if(ch == 'L'){
                if(stk.isEmpty()){
                    stk.push(ch); // no collision
                } else if(stk.peek() == 'S'){
                    cnt += 1; // L hits S
                } else if(stk.peek() == 'R'){
                    // pop all R’s and add collisions
                    while(!stk.isEmpty() && stk.peek() == 'R'){
                        stk.pop();
                        cnt++;
                    }
                    // L also becomes S after collision
                    cnt++;
                    stk.push('S');
                } else {
                    stk.push(ch); // L after L
                }
            }
            else if(ch == 'S'){
                if(stk.isEmpty()){
                    stk.push('S');
                } else if(stk.peek() == 'R'){
                    // pop all R’s and count collisions
                    while(!stk.isEmpty() && stk.peek() == 'R'){
                        stk.pop();
                        cnt++;
                    }
                    stk.push('S');
                } else {
                    stk.push('S');
                }
            }
            else{ // ch == 'R'
                stk.push('R');
            }
        }
        return cnt;
    }
}
