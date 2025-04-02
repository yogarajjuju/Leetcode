class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 1, right = nums.length , ans = 1;
        while(left<= right){
            int mid = left+(right-left)/2;
            if(CanAchiveFrequency(nums,k,mid)){
                ans = mid;
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return ans;

    }

    public boolean CanAchiveFrequency(int [] nums , int k , int f){
 int n = nums.length;
 if (f > n) return false;
        long sum = 0;
       
        for(int i = 0; i<f; i++){
            sum+=nums[i];
        }
        if((long)f* nums[f-1]-sum<=k){
            return true;
        } 
        for(int i =f;i<n; i++){
            sum +=nums[i]-nums[i-f];
            if((long)f*nums[i]-sum<=k){
                return true;
            }
        }
        return false;

    }
}