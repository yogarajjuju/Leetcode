class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int  minlength = Integer.MAX_VALUE;
        int windowsum =0;
        int windowstart=0;
        for(int windowend=0;windowend<nums.length;windowend++){
            windowsum+=nums[windowend];
            while(windowsum>=target){
                minlength=Math.min(minlength,windowend-windowstart+1);
                windowsum-=nums[windowstart];
                windowstart++;
            }
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
        
    }
}