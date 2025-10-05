class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count =0; 
        int start =0; 
        int pro=1;
        if(k<=1) return 0;
        for(int end =0; end<nums.length;end++){
             pro*=nums[end];

             while(pro>=k){
                pro/=nums[start];
                start++;
             }
             count+=end-start+1;
        }
        return count;
        
    }
}