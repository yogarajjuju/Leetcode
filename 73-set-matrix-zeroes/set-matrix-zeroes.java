class Solution {
    public void setZeroes(int[][] m) {
        int r = m.length;
        int c= m[0].length;
        boolean[] zr = new boolean[r];
        boolean [] zc=new boolean[c];
        for(int i =0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(m[i][j]==0){
                    zr[i]=true;
                    zc[j]=true;
                }
            }
        }
        for(int i =0;i<r;i++){
            if(zr[i]){
                for(int j=0;j<c;j++){
                    m[i][j]=0;
                }
            }
        }
        for(int i=0;i<c;i++){
            if(zc[i]){
                for(int j=0;j<r;j++){
                    m[j][i]=0;
                }
            }
        }

    }
}