class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s==null){
        return false;
       }  if(s.length()==0){
        return true;
       }
       int i =0,j=0;
       while(i<s.length()&& j<t.length()){
        char cs= s.charAt(i);
        char ct = t.charAt(j);
        if(cs==ct){
            i++;
        }
        j++;
       }
        return i ==s.length();
    }
   
}