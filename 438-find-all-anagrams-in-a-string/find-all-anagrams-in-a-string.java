class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length())
            return ans;
        int[] freqS = new int[26];
        int[] freqP = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            freqP[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(freqS, freqP)) {
            ans.add(0);
        }
        for (int i = p.length(); i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++;
            freqS[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(freqS, freqP))
                ans.add(i - p.length() + 1);
        }
        return ans;
    }
}