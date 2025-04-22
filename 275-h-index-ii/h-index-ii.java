class Solution {
    public int hIndex(int[] citations) {
       int n = citations.length;
       int left = 0; 
       int right = n-1;
       while(left<=right){
        int mid = left+(right-left)/2;
      int   h = n - mid;
        if(citations[mid]==h){
            return h;
        } else if(citations[mid]<h){
            left = mid+1;
        } else {
            right = mid -1;
        }
       }
       return n-left;
    }
}