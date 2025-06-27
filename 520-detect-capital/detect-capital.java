class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||    // All uppercase
               word.equals(word.toLowerCase()) ||    // All lowercase
               (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()));  // Only first letter uppercase
    }
}
