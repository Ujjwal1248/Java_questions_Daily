class Solution {
    public boolean checkInclusion(String p, String s) {
        if (p.length() > s.length())
            return false;
        int[] freqS = new int[26];
        int[] freqP = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            freqP[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(freqS, freqP)) {
            return true;
        }
        for (int i = p.length(); i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            freqS[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(freqS, freqP)) return true;
        }
        return false;
    }
}