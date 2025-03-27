class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
      int  left = 1, right = nums.length;
        while(left<=right){

            int mid = left+(right-left)/2;
            int count = countGorE(nums,mid);
            if(count == mid){
                return mid;
            } else if(count>mid){
                left=mid+1;
            } else{
                right = mid-1;
            }
          
        }
        return-1;
    }
        
        public int countGorE(int nums[],int x){
            int start = 0, end= nums.length-1;
            while(start<=end){
                int mid =start+(end-start)/2;
                if(nums[mid]>=x){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
                
            }
            return nums.length-start;
        }

    }
