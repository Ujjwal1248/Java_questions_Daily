class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()) return ans;
        int[] arrS = new int[26];
        int[] arrP = new int[26];

        for(int i = 0; i < p.length(); i++){
            arrS[s.charAt(i) - 'a']++;
            arrP[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arrS, arrP)) ans.add(0);

        for(int i = p.length(); i < s.length(); i++){
            arrS[s.charAt(i) - 'a']++;
            arrS[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(arrS, arrP)) ans.add(i - p.length() + 1);
        }
        return ans;
    }
}