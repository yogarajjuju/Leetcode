class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int max =-1;
        for(int i: nums){
            if(s.contains(-i)){
                max= Math.max(max,Math.abs(i));
            
            }
            else{
                s.add(i);
            }
        }
        return max;
    }
}