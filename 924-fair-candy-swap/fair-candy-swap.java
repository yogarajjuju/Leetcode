class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
      int  sumA=Arrays.stream(aliceSizes).sum();
       int sumB=Arrays.stream(bobSizes).sum();
        int diff= (sumB-sumA)/2;
        Arrays.sort(bobSizes);
        for(int x:aliceSizes){
            int y = x+diff;
            if(binarysearch(bobSizes,y)){
                return new int[]{x,y};
            
            }
             
        }
         return new int[0];
    }
        
        public boolean binarysearch(int arr[],int target){
            int start =0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                
                if(arr[mid]== target){
                    return true;
                } else if(arr[mid]<target){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
             return false;
        }
       
    }
