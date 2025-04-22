class Solution {
    public int threeSumClosest(int[] arr, int target) {
     Arrays.sort(arr);
     int resultsum = arr[0]+   arr[1]+arr[2];
     int mindiff = Integer.MAX_VALUE;
     for(int i =0;i<arr.length-2;i++){
        int left = i+1;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[i]+arr[left]+arr[right];
            if(sum == target){
                return target;
            } else if(sum<target){
                left++;
            } else{
                right--;
            }
            int difftotarget = Math.abs(sum-target);
            if(difftotarget<mindiff){
                resultsum = sum;
                mindiff = difftotarget;
            }
        }
     }
     return resultsum;
    }
}