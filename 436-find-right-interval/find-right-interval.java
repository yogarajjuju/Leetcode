class Solution {
    public int[] findRightInterval(int[][] intervals) {
      int n = intervals.length;
      int[] result = new int[n];
      int [][] sorted= new int[n][3];
      
      for(int i =0; i<n; i++){
        sorted[i] = new int []{intervals[i][0], intervals[i][1],i};
      
      }
      Arrays.sort(sorted, (a, b) -> Integer.compare(a[0], b[0]));
      for(int i =0;i<n;i++){
        int end =sorted[i][1];
        int left =0, right = n-1, found=-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if (sorted[mid][0] >= end){
                found =sorted[mid][2];
                right = mid-1;
            } else{
                left=mid+1;
            }

        }
        result[sorted[i][2]]=found;
        
      }
      return result;
    }
    
}