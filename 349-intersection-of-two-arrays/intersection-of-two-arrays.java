class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums2){
            if(binarysearch(nums1,num)){
                set.add(num);
            }
        }
        int [] result = new int[set.size()];
        int i = 0;
        for(int num:set){
            result[i++] = num;
        }
        return result;
    }
    public boolean binarysearch(int arr[] , int target){
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid= start +(end-start)/2;
            if(arr[mid]==target){
                return true;

            } else if(arr[mid]<target){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return false;
    }
}