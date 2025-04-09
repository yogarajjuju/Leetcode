class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] leftpro = new int[nums.length];
      int[] rightpro = new int[nums.length];
      for(int i =0,temp=1;i<nums.length;i++){
        leftpro[i] = temp;
        temp*=nums[i];
      }  
      for(int i =nums.length-1,temp =1; i>=0;i--){
        rightpro[i]=temp;
        temp*=nums[i];
      }
      int ans[] = new int[nums.length];
      for(int i =0; i<nums.length;i++){
        ans[i] = leftpro[i]*rightpro[i];
      }
      return ans;
    }
}