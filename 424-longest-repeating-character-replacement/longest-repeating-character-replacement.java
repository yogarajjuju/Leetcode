class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==0||s==null) return 0;
       
        int start=0, len=0, maxfreq=0;

        HashMap<Character,Integer>map = new HashMap<>();

        for(int end =0; end<s.length();end++){
            char rightchar=s.charAt(end);

            map.put(rightchar,map.getOrDefault(rightchar,0)+1);
            maxfreq=Math.max(maxfreq,map.get(rightchar));

            int windowlen= end-start+1;

            if(windowlen-maxfreq > k){
                char leftchar= s.charAt(start);
                map.put(leftchar,map.get(leftchar)-1);
                start++;
            }
            len=Math.max(len,end-start+1);

        }
         return len;

        
    }
}