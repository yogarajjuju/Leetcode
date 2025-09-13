class Solution {
    public int reverse(int num ){
        long rev=0;
        while(num!=0){
            int digit = num%10;
            rev=digit+rev*10;
            num/=10;

        }
        if(rev< Integer.MIN_VALUE||rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
        
    }
}