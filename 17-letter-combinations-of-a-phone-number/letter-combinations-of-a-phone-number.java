class Solution {
    static String []map={
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        ArrayList<String> list= new ArrayList<>();
        if(digits==null||digits.isEmpty()) 
        return list;
        return pad("",digits);
       
        
    }
    static List<String>pad(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        String letters  = map[digit];
        for(int i=0;i<letters.length();i++){
            char ch= letters.charAt(i);
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
}