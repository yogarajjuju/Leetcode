class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count =0;
        for(int i =0; i<nums.length;i++){
            int min =lower-nums[i];
            int max= upper-nums[i];
            int left =lowerbound(nums,min,i+1);
            int right = upperbound(nums,max,i+1);
            count +=right -left;
        } 
        return count;
    }
    public int lowerbound(int [] nums,int target,int start){
        int low =start , high = nums.length;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                low= mid+1;
            }
            else{
                high =mid;
            }
        }
        return low;
    }
    public int upperbound(int [] nums,int target,int start){
        int low =start , high = nums.length;
        while(low<high){
            int mid =( low+high)/2;
            if(nums[mid]<=target){
                low= mid+1;
            }
            else{
                high =mid;
            }
        }
        return low;
    }

}