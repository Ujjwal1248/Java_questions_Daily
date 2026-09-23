class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r= 0, count = 0, maxCount = 0;
        int n = s.length();
        while(r < n){
            char ch = s.charAt(r);
            while(map.containsKey(ch)){
                map.remove(s.charAt(l));
                l++;
            }
            count = r-l+1;
            map.put(ch, r);
            maxCount = Math.max(maxCount, count);
            r++;
        }
        return maxCount;
    }
}