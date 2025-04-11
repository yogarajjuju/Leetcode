class Solution {
    public void rotate(int[] nums, int k) {
       k%=nums.length;
       reverse(nums,0,nums.length-1);//to reverse entire array
       reverse(nums,0,k-1);//to reverse array elements till k
       reverse(nums,k,nums.length-1); // to reverse elements after k
    }
    public void reverse(int nums[],int s,int e){
        while(s<e){
            int temp = nums[s];
            nums[s]= nums[e];
            nums[e]= temp;
            s++;
            e--;
        }
    }
}