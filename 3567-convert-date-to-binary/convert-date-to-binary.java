class Solution {
    public String convertDateToBinary(String date) {
        
        String[] arr = date.split("-");

        String year = toBn(Integer.parseInt(arr[0]));
        String month = toBn(Integer.parseInt(arr[1]));
        String day = toBn(Integer.parseInt(arr[2]));

        return year +"-"+ month +"-"+ day;
    }


    private String toBn(int n){
        if(n==0) return "0";


        StringBuilder sb = new StringBuilder();

        while(n > 0){

            sb.append(n%2);

            n /= 2;
        }


        return sb.reverse().toString();
    }
}