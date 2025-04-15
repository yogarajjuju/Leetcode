class Solution {
    public String reverseWords(String s) {
        String [] words =s.trim().split("\\s+");
        int i =0, j =words.length-1;
        while(i<j){
            String t =words[i];
            words[i]= words[j];
            words[j]=t;
            i++;
            j--;
        }
        return String.join(" ",words);
    }
}