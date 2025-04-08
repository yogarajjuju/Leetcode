class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [] [] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        List<int[]> ans= new ArrayList<>();
        int r= rStart, c=cStart;
        int diri=0;
        int steps=1;
        ans.add(new int[] {r,c});
        while(ans.size()<rows*cols){
            for(int j =0;j<2;j++){
                for(int i =0;i<steps;i++){
                    r+=dir[diri][0];
                    c+=dir[diri][1];
                    if(r>=0&&r<rows&& c>=0 &&c<cols){
                        ans.add(new int[]{r,c});
                    }
                }
                diri =(diri+1)%4;

            }
           steps++;
        }
         return ans.toArray(new int[rows*cols][2]);
    }
}