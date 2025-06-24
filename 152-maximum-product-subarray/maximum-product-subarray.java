class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];
        for(int i =1;i<nums.length;i++){
            int temp = Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
            min = Math.min(nums[i], Math.min(min*nums[i], max*nums[i]));
            max = temp;
            res = Math.max(res,max);

        }
        return res;
    }
}