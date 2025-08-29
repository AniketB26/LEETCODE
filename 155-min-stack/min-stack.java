class MinStack {
    long mini = Long.MAX_VALUE;
     Stack<Long> stk;
    


    public MinStack() {
       stk = new Stack<Long>();
    }
    
    public void push(int vall) {
        long val = vall;
        if(stk.isEmpty()){
            stk.add(val);
            mini = val;
        }

        else{
            if(val < mini){
                
                long data = 2*val- mini;
                stk.push(data);
                mini = val;
            }
            else{
                stk.push(val);
            }
        }
    }
    
    public void pop() {
        if (stk.isEmpty()) return;
        long curr = stk.pop();
        if (curr < mini) {  
            // curr is the encoded value
            mini = 2 * mini - curr; 
        }

    }
    
    public int top() {
        if(stk.isEmpty()) return -1;
        long curr = stk.peek();
        if(curr < mini){
            return (int)mini;
        }
        else{
            return (int)curr;
        }
    }
    
    public int getMin() {
        if(stk.isEmpty()) return -1;

        return (int)mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */