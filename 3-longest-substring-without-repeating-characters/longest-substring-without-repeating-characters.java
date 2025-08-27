class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s.length();
        int maxans = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> se = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (se.contains(s.charAt(j))) {
                    break;
                }
                se.add(s.charAt(j));
                maxans = Math.max(maxans, j - i + 1);
            }
        }
        return maxans;
    }
}