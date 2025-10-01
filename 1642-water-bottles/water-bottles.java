class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tot= numBottles;
        int empty = numBottles;

        while(empty >= numExchange){
            
            int neww = empty/ numExchange;
            tot += neww;

            empty = empty % numExchange + neww;
            

            

        }

        

        return tot;
    }
}