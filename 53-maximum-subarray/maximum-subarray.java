class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum =nums[0];
        int cursum =0;
    
        for(int num:nums){
            cursum+=num;
             maxsum=Math.max(maxsum,cursum);

           
            if(cursum<0){
                cursum=0;
                
            }
            
        }
        return maxsum;

        
    }
}