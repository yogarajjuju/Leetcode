class Solution {
    public int[] replaceElements(int[] arr) {
        // create a ans array of size nums;
        //declare rightmax=-1;
        // now we need to iterate the ARRAY in reverse;
        // now assign the value of ans=rightmax;
        // now find the maximum of rightmax and ans[i]
        // retun the ans array

        int n = arr.length;
        int ans[]= new int[n];
        int rightmax=-1;
        for(int i =n-1;i>=0;i--){
            ans[i]=rightmax;
            rightmax =Math.max(rightmax,arr[i]);
        }
        return ans;
        
    }
}