class Solution {
    //optimized way
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            int num = 2*arr[i];
            if(check(arr,num,i)){
                return true;
            }
        }
         return false;
           
        }
        public boolean check(int arr[], int num , int index){
            for(int i = 0;i<arr.length;i++){
                if(index!=i&&arr[i]==num){
                    return true;
                }
            }
            return false;
        }
}




// using binarysearch
 //     Arrays.sort(arr);
    //     for(int i =0;i<arr.length;i++){
    //         if(binarysearch(arr,2*arr[i],i)){
    //             return true;
    //         } 
    //     }
    //     return false;
    // }
    // public boolean binarysearch(int []arr , int target,int exclude){
    //     int start = 0, end = arr.length-1;
    //     while(start<=end){
    //         int mid = start+(end-start)/2;
    //         if(arr[mid]==target&& mid!=exclude){
    //             return true;
    //         } else if(arr[mid]<target){
    //             start=mid+1;
    //         } else{
    //             end = mid-1;
    //         }
    //     }
    //     return false;
    // }