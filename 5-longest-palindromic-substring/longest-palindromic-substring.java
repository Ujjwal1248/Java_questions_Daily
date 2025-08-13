class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < s.length(); i++) {
            int low = i - 1;
            int high = i;
            // Even
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                int length = high - low + 1;
                if (length > maxLength) {
                    maxLength = length;
                    start = low;
                }
                low--;
                high++;
            }
            //Odd
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                int length = high - low + 1;
                if (length > maxLength) {
                    maxLength = length;
                    start = low;
                }
                low--;
                high++;
            }
        }
        return s.substring(start, start + maxLength);
    }
}