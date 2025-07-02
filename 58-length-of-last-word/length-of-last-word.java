class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){//to check the sentence has space if no we can count the letters 
                count++;
            } else if(i+1<s.length()&& s.charAt(i+1)!=' '){// if we found the space we  reset the counter to 0
                count=0;
            }
        }
        return count;
    }
}