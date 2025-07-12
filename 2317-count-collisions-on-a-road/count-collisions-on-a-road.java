class Solution {
    public int countCollisions(String directions) {
       char[] car = directions.toCharArray();
        int cnt = 0;
       int left = 0;

       while(left < car.length && car[left] == 'L'){
        left++;
       }

       int right = car.length -1 ;

       while(right >= 0 && car[right] == 'R'){
        right--;
       }


       for(int i =left ; i<= right; i++){
        if(car[i] != 'S'){
            cnt++;
        }
       }

        return cnt;

    }
}
