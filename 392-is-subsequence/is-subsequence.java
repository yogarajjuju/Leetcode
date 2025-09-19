class Solution {
    public boolean isSubsequence(String s, String t) {

        // two pointers
        // iterate using while loop

    // compare the i and j is equal i++ the j++ the retrun the i equal to s.length();
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            } 
            j++;
        }
        return i==s.length();
        
        
    }
}