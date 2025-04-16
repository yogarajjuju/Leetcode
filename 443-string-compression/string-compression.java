class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int s=0;
        while(s<chars.length){
            int e=s;
            while(e<chars.length&&chars[s]==chars[e]){
                
                e++;
            }
            int count =e-s;
            chars[index++]=chars[s];
            if(count>=2){
                char[] freq = Integer.toString(count).toCharArray();
                for(char ch:freq){
                    chars[index++]=ch;
                }
            }
            s=e;
        }
        return index;
        
    }
}