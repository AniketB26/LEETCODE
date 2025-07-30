class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for(int i =0; i<numRows; i++){
            rows.add(new StringBuilder());
        }

        int row = 0;
        boolean down = false;
        for(char c : s.toCharArray()){
            rows.get(row).append(c);

            if(row == 0 || row == numRows -1){
                down = !down;
            }


            row += down ? 1 : -1;


        }

        StringBuilder res = new StringBuilder();

        for(StringBuilder sb : rows){
            res.append(sb);
        }

        return res.toString();
    }
}