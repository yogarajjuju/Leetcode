class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String previous =countAndSay(n-1);
        StringBuilder current =new StringBuilder();
        int count =1;
        for(int i =1;i<previous.length();i++){
            if(previous.charAt(i)==previous.charAt(i-1)){
                count++;
            } else{
                current.append(count).append(previous.charAt(i-1));
                count=1;
            }
        }
        current.append(count).append(previous.charAt(previous.length()-1));
        return current.toString();
        
    }
}