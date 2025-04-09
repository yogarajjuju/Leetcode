class Solution {
    public boolean canJump(int[] nums) {
        int r =0;
        for(int i=0;i<nums.length;i++){
            if(i>r){
                return false;
            }
            r = Math.max(r,i+nums[i]);
        }
        return true;
    }
}