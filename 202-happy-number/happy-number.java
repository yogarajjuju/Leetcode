class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n=getsquare(n);
        }
        return true;
        
    }
    int getsquare(int num){
        int sum =0;
        while(num>0){
            int digit=num%10;
            sum+=digit*digit;
            num/=10;
        }
        return sum;
    }
}