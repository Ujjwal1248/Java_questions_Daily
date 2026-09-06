class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()) return ans;
        int[] aS = new int[26];
        int[] aP = new int[26];
        for(int i = 0; i < p.length(); i++){
            aS[s.charAt(i) - 'a']++;
            aP[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(aS, aP)) ans.add(0);
        for(int i = p.length(); i < s.length(); i++){
            aS[s.charAt(i) - 'a']++;
            aS[s.charAt(i - p.length()) - 'a']--;
            if(Arrays.equals(aS, aP)) ans.add(i - p.length() + 1);
        }
        return ans;
    }
}