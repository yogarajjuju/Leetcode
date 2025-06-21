class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  result =new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        if(numRows==1) return result;
        for(int i=1;i<numRows;i++){
            List<Integer> prevrow=result.get(i-1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j=0;j<i-1;j++){
                row.add(prevrow.get(j)+prevrow.get(j+1));

            }
            row.add(1);
            result.add(row);
        }
        return result;
        
    }
}