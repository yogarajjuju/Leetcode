class Solution {
    public List<Integer> countSmaller(int[] nums) {
     List<Integer> result = new ArrayList<>();
     List<Integer> sortedList = new ArrayList<>();
     for(int i = nums.length-1; i>=0;i--){
        int index = bs(sortedList,nums[i]);
       result.add(index);
       sortedList.add(index,nums[i]); 
     }  
     Collections.reverse(result);
     return result;

    }
    public int bs(List<Integer> sortedList,int num){
        int left= 0, right = sortedList.size();
        while(left<right){
            int mid = left+(right-left)/2;
            if(sortedList.get(mid)>=num){
                right  = mid;
            } else{
                left = mid+1;
            }
        }
        return left;
    }
}