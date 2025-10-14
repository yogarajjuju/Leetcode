class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        int[]charcount =new int[26];

        for(char c:s.toCharArray()){
            charcount[c-'a']++;
        }

        for(char c:t.toCharArray()){
            charcount[c-'a']--;
        }
        for(int count:charcount){
            if(count!=0){
                return false;
            }
        }
        return true;
        
    }
}