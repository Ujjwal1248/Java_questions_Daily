class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int startP = 0, endP = 0;
        for (int i = 0; i < s.length(); i++) {
            endP = Math.max(endP, last[s.charAt(i) - 'a']);
            if (i == endP) {
                ans.add(endP - startP + 1);
                startP = i + 1;
            }
        }
        return ans;
    }
}