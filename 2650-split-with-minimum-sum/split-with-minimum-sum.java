class Solution {
    public int splitNum(int num) {
        List<Integer> list = new ArrayList<>();

        while(num != 0){
            list.add(num%10);
            num = num/10;
        }

        Collections.sort(list);


        int num1 = list.get(0);
        int num2 = list.get(1);

        list.remove(0);
        list.remove(0);

        boolean num1chance = true;

        for(int it : list){

            if(num1chance){
                num1 *= 10;
                num1 += it;
                num1chance = false;


            }
            else{
                num2 *= 10;
                num2 += it;

                num1chance = true;
            }
        }



        return num1+num2;

    }
}