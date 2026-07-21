class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = n - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            ans.append(s.substring(j + 1, i + 1));
            ans.append(" ");
            i = j;
        }
        return ans.toString().trim();
    }
}