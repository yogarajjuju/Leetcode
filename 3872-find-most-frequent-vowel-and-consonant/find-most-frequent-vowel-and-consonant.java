class Solution {
    public int maxFreqSum(String s) {
        int feq[]= new int[26];
        int maxvo=0;
        int maxco=0;
        for(char c:s.toCharArray()){
            feq[c-'a']++;
        }

        for(int i=0;i<26;i++){
            char c=(char)(i+'a');

            if(c=='a'|| c=='i' || c=='o' || c=='e' || c=='u'){
                
                maxvo=Math.max(maxvo,feq[i]);
            } else {
                maxco=Math.max(maxco,feq[i]);
            }
        }
        return maxvo+maxco;
        
    }
}