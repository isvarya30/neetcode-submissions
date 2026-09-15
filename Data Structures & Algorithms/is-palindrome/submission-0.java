class Solution {
    public boolean isPalindrome(String s) {

        String ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(ss);
        sb.reverse();

        return sb.toString().equals(ss);
    }
}