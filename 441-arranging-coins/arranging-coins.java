class Solution {
    public int arrangeCoins(int n) {
       int start = 1;
       int end = n;
       while(start<=end){
        long mid = start +(end-start)/2;
        long sum = (mid*(mid+1))/2;
        if(sum == n){
            return  (int)mid;
        } else if(sum<n){
            start =(int) mid +1;
        } else{
            end = (int)mid -1;
        }
       }
       return end;
    }
}