/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start= 1 , end = n;
        while(start<end){
            int mid = start+(end-start)/2;
            boolean ans = isBadVersion(mid);
            if(ans == true){
                end = mid;
            } else{
                start = mid+1;
            }
        }
        return end;
        
    
    }
}