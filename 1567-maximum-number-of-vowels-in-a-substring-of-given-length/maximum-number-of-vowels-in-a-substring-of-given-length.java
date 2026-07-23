class Solution {
    public int maxVowels(String s, int k) {
        int maxV = 0;
        int l = 0, r = 0;
        int currV = 0;
        while (r < s.length()) {
            if (check(s.charAt(r))) {
                currV++;
            }
            if (r - l + 1 == k) {
                maxV = Math.max(maxV, currV);
                if (check(s.charAt(l))) {
                    currV--;
                }
                l++;
            }
            r++;
        }
        return maxV;
    }

    public boolean check(char s) {
        return s == 'a' || s == 'e' || s == 'i' || s == 'o'|| s == 'u';
    }
}