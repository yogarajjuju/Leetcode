class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0; 
        while(i<nums.length){
            int crt = nums[i]-1;
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[crt]){
                swap(nums,i, crt);
            } else{
                i++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    void swap (int nums[], int first, int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]= temp;
    }
    
}