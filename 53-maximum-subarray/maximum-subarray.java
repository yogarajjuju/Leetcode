class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int cursum=0;
        for(int num:nums){
            cursum+=num;
            if(cursum>sum){
                sum=cursum;
            } if(cursum<0){
               cursum=0;
            }
        }
        return sum;

        
    }
}