class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        String vow = "AEIOUaeiou";
        int st =0;
        int e = ch.length-1;
        while(st<e){
            while(st<e&&vow.indexOf(ch[st])==-1){
                st++;
            }
            while(st<e&&vow.indexOf(ch[e])==-1){
                e--;
            }
            char temp =ch[st];
            ch[st]= ch[e];
            ch[e] = temp;
            st++;
            e--;
        }
        return new String(ch);
    }
}