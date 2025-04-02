class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low =0, high =0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        while(low<high){
            int mid = low +(high-low)/2;
                if(canShip(weights,days,mid)){
                    high=mid;
                } else{
                    low=mid+1;
                }
            
        }
        return low;
    
    }
    public boolean canShip(int[] weights ,int days, int capacity){
        int currentload=0;
        int requiredday=1;
        for(int w :weights){
            if(currentload+w>capacity){
                requiredday++;
                currentload=0;
            }
            currentload+=w;
            if(requiredday>days){
                return false;
            }
        }
        return true;
    }
}