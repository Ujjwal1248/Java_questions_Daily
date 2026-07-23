class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        int pow = 1<<k;
        for (int i = 0; i < s.length() - k+1; i++) {
            String curr = s.substring(i, i+k);
            if(!map.containsKey(curr)) map.put(curr, k);
            if(map.size() == pow) return true;
        }
        return false;
    }
}