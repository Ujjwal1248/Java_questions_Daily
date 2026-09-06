class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int max = 0, n = s.length();
        while(r < n){
            if(!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), r);
                max = Math.max(max, r-l+1);
                r++;
            }
            else{
                map.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}