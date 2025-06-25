class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2) return -1;
        int a = Math.min(nums[0],nums[1]);
        int b = Math.max(nums[0], nums[1]);
        int c = nums[2];
        if(a>c) return a;
        else if (b<c) return b;
        else return c;
    }
}