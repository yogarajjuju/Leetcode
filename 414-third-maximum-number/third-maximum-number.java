class Solution {
    public int thirdMax(int[] arr) {
        
           long f =Long.MIN_VALUE;
        long s =Long.MIN_VALUE;
        long t =Long.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>f){
                t=s;
                s=f;
                f=arr[i];
            } else if(arr[i]>s&& arr[i]!=f){
                t=s;
                s=arr[i];
            } else if(arr[i]>t && arr[i]!=s && arr[i]!=f){
                t=arr[i];
            }
        }
        return t ==Long.MIN_VALUE ?(int)f: (int)t;
    }
}