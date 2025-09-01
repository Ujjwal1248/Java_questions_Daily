class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int n = s.length();
        int m = t.length();
        int[] hash = new int[256];  // Array to store frequency of chars in t
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        int l = 0, r = 0;
        int count = 0;       // Number of chars matched so far
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while (r < n) {
            // If current char is needed, decrease its count in hash and increase matched count
            if (hash[s.charAt(r)] > 0) count++;
            hash[s.charAt(r)]--;
            r++;

            // When all chars are matched, try to shrink from left
            while (count == m) {
                if (r - l < minLen) {
                    minLen = r - l;
                    startIndex = l;
                }
                
                hash[s.charAt(l)]++;
                if (hash[s.charAt(l)] > 0) count--;
                l++;
            }
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
