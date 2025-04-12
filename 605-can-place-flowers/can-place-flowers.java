class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        for(int i =0;i<f.length;i=i+2){
            if(f[i]==0){
                if(i==f.length-1||f[i]==f[i+1]){
                n--;
            } else{
                i++;
            }
        }
    }
    return n<=0;
}
}