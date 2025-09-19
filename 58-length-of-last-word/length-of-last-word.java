class Solution {
    public int lengthOfLastWord(String s) {
        // trim the spaces 
        // declare a len var =0;
        // itreate in reverse 
        //ifs.charat(i)!=' ' len++
        //elseif(length>0) break 

        // then return the length

        s=s.trim();
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            } else if(len>0){
                break;
            }
        }
        return len;
        
    }
}