class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int count = 0;
        for(int num:nums){
            int comp = k-num;
            if(freq.getOrDefault(comp,0)>0){
                count++;
                freq.put(comp,freq.get(comp)-1);
            } else{
                freq.put(num,freq.getOrDefault(num,0)+1);
            }
        }
        return count;


    }
}