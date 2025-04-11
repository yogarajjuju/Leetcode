class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count =0;
        while(low<=high){
            String value =String.valueOf(low);
            int len =value.length();
            if(len%2==0){
                String Fh=value.substring(0,len/2);
                String Sh=value.substring(len/2);
                if(digitsum(Fh)==digitsum(Sh)){
                    count ++;
                }
                
            }
            low++;
        }
        return count;
    }
    public int digitsum(String digit){
        int n =Integer.parseInt(digit);
        int sum =0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}