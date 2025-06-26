class Solution {
    public boolean isCircularSentence(String str) {
        int n = str.length();
        if(str.charAt(0)!=str.charAt(n-1)){
            return false;
           
        }
        for(int i=1;i<n;i++){
            if(str.charAt(i)==' '){
                if(str.charAt(i-1)!=str.charAt(i+1)){
                    return false;
                    
                }
            }


        }
        return true;

    }
}