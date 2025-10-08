class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows==0) return triangle;


        for(int i=0; i<numRows;i++){
            List<Integer> newrow=new ArrayList<>();
            for(int j=0; j<=i;j++){
                if(j==0||j==i){
                    newrow.add(1);
                } else{
                  List<Integer> prevrow=triangle.get(i-1);
                  int num =prevrow.get(j-1)+prevrow.get(j);
                  newrow.add(num);
            }
            }
            triangle.add(newrow);
        }
        return triangle;
        
    }
}