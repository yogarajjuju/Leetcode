class Solution {
    // greedy approach 
    public int jump(int[] nums) {
     int totalJumps=0;
     int dest = nums.length-1;
     int coverage =0, lastjumpidx=0;
     if(nums.length==1) return 0;//base case
     for(int i= 0; i<nums.length;i++){
        coverage = Math.max(coverage, i+nums[i]);
        if(i==lastjumpidx){
            lastjumpidx=coverage;
            totalJumps++;
            if(coverage>=dest){
                return totalJumps;
            }
        }
       
     }  
      return totalJumps;
    }
}