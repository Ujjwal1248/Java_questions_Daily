class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int n = s.length();
        int len = 0;
        while(r < n){
            while(map.containsKey(s.charAt(r))){
                map.remove(s.charAt(l));
                l++;
            }
            map.put(s.charAt(r) , r);
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}