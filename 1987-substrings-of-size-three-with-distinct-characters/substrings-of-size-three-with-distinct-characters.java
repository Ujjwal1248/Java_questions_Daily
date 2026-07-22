class Solution {
    public int countGoodSubstrings(String s) {
        int good = 0;
        for(int i = 0; i < s.length()-2; i++){
            int a = s.charAt(i) - 'a';
            int b = s.charAt(i+1) - 'a';
            int c = s.charAt(i+2) - 'a';
            if(a!=b && b!=c && a!=c) good++;
        }
        return good;
    }
}