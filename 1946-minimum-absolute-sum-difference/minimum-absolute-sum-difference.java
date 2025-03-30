class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD =1_000_000_007;
        int n =nums1.length;
        long totalsum = 0;
        int maxReduction =0;

        int[] sortedNums1= nums1.clone();
        Arrays.sort(sortedNums1);

        for(int i =0;i<n; i++){
            int diff=Math.abs(nums1[i]-nums2[i]);
            totalsum=(totalsum+diff)%MOD;
            int closest= findClosest(sortedNums1,nums2[i]);
            int newDiff=Math.abs(closest-nums2[i]);
            int improvement = diff-newDiff;
            maxReduction =Math.max(maxReduction,improvement);

        }
        return (int) ((totalsum - maxReduction+MOD)%MOD);
    }
    public int findClosest(int[] sortedNums1, int target){
        int left =0, right=sortedNums1.length-1;
        int closest = sortedNums1[0];
        while(left<=right){
            int mid = left +(right-left)/2;
            if(Math.abs(sortedNums1[mid]-target)< Math.abs(closest-target)){
                closest = sortedNums1[mid];
            } 
            if(sortedNums1[mid]<target){
                left = mid+1;
            } else{
                right = mid - 1;
            }
        }
        return closest;
    }
}