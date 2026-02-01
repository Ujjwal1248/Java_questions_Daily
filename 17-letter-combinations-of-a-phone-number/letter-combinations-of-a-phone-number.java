class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        List<String> result = new ArrayList<>();
        solve(digits, "", mapping, 0, result);
        return result;
    }

    public void solve(String digits, String curr, String[] mapping, int idx, List<String> result) {
        if (idx == digits.length()) {
            result.add(curr);
            return;
        }
        int number = digits.charAt(idx) - '0';
        String str = mapping[number];
        for (int i = 0; i < str.length(); i++) {
            solve(digits, curr + str.charAt(i), mapping, idx + 1, result);
        }
    }
}