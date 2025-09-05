class Solution {

    // by using fast and skow pointer method ;
    public boolean isHappy(int n) {
        int slow = n , fast = n;
        //while loop is not used here because initially slow and 
//fast pointer will be equal only, so the loop won't run.
        do{
            //slow moving one step ahead and fast moving two steps ahead
            slow=findSquare(slow); // move slow pointer by 1 i.e  find sqrt 1 time 
            fast=findSquare(findSquare(fast));  // move the fast pointer 2 times i.e find sqrt 2x times than slow pointer

        } while(slow!=fast);

        //if a cycle exists, then the number is not a happy number
//and slow will have a value other than 1

        if(slow==1){
            return true;
        }
        return false;
        
    }
    private int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem = num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}