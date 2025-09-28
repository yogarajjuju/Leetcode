class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int compliment = target-current;
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}