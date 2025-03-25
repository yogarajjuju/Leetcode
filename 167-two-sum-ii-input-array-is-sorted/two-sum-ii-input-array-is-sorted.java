class Solution {//the index of arr starts with 1
    public int[] twoSum(int[] arr, int target) {
       int left = 0, right =arr.length-1;
       while(left<right){
        int sum = arr[left]+arr[right];
        if(sum == target){
            return new int[]{left+1, right+1};
        } else if(sum <target){
            left++;
        } else {
            right--;
        }
       }
       return null;
    }// two pointer method 
}