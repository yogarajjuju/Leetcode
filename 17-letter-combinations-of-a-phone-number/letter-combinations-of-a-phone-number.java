class Solution {
     static final String[] Keypad = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String>list = new ArrayList<>();
        if(digits==null||digits.length()==0) return list;
        pad("",digits,list);
        return list;
        
    }
    static void pad(String p , String up,List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        String chars = Keypad[digit];
        for(char ch :chars.toCharArray()){
            pad(p+ch,up.substring(1),list);
        }
    }
}