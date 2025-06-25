class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++){
            int bitcount = Integer.bitCount(arr[i]);// to get the bit 
            arr[i]+=bitcount*100000;//prioritize the bit
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            arr[i]%=100000;// to return the origina arr
        }
        return arr;
        
    }
}