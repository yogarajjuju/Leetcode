class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while(low<=high){
            long  mid = low +(high-low)/2;
            long ans = mid * mid;
            if(ans==num){
                return true;
            }else if(ans<num){
                low=(int)mid+1;
            }else{
                high=(int)mid-1;
            }
        }
        return false;
    }
}