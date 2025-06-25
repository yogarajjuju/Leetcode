class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++){
            int bitcount = Integer.bitCount(arr[i]);
            arr[i]+=bitcount*100000;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            arr[i]%=100000;
        }
        return arr;
        
    }
}