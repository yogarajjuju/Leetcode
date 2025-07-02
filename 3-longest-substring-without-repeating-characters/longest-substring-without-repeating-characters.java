class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> seen = new HashSet<>();
        int left =0, right =0, maxlen=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!seen.contains(ch)){
                seen.add(ch);
                right++;
                maxlen=Math.max(maxlen,right-left);
            } 
            else{
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}