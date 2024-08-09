class Solution {
    public List<Integer> generateRows(int row){     //to calculate each row elements
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        long ans=1;            

        for(int col=1;col<row;col++){
            ans = ans * (row-col);          
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansFull = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ansFull.add(generateRows(row));
        }
        return ansFull; 
    }
}