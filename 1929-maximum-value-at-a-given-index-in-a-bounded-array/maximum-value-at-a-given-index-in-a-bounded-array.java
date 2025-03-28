class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int low = 1, high = maxSum;
        while(low<=high){
            int mid = low +(high-low)/2;
            long totalSum =findSum(mid,index,n);
            if(totalSum<=maxSum){
                low = mid+1;
            } else{
                high=mid-1;
            }
        }
        return high;

    }
    public long findSum(int mid , int index ,int n){
        long leftsum=suminrange(mid-1,index);
        long rightsum = suminrange(mid-1,n-index-1);
        return leftsum+rightsum+mid;

    } 
    public long suminrange(int value , int length){
        if(value>=length){
            return(long)(value+(value-length+1))*length/2;
        } else{
            return(long)value*(value+1)/2+(length-value);
        }
    }
}