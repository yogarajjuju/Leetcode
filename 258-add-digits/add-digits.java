class Solution {
    public int addDigits(int num) {
        int ans =0;
        if(num==0){
            return 0;
        } else if(num%9!=0){
            ans=num%9;
        } else{
            return 9;
        } 
        return ans;
    }
}