class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int left= 0, right = n -1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            int maxRow=0;
            for(int i =0; i<m; i++){
                if(mat[i][mid]>mat[maxRow][mid]){
                    maxRow=i;
                }
            }
            int leftneighbour = (mid > 0) ? mat[maxRow][mid - 1] : -1;
            int rightneighbour = (mid<n -1) ? mat[maxRow][mid+1]:-1;

            if(mat[maxRow][mid]>leftneighbour && mat[maxRow][mid]>rightneighbour){
                return new int[]{maxRow,mid};
            }
            if(leftneighbour>mat[maxRow][mid]){
                right = mid-1;

            } else{
                left = mid+1;
            }
        }
         return new int []{-1,-1};
    }
   
}