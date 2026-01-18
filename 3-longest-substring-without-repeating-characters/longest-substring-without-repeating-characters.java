class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = -1;
        int maxLength = 0;
        HashMap<Character, Integer> map =new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                start = Math.max(start,map.get(ch));
            }
            map.put(ch, i);
            maxLength = Math.max(maxLength, i-start);
        }
        return maxLength;
    }
}