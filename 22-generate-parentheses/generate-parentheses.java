class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        helper(n, 0, 0, "");
        return ans;
    }

    public void helper(int n, int open, int close, String curr) {
        if (open+close == 2 * n) {
            ans.add(curr);
            return;
        }

        if (open < n) {
            helper(n, open + 1, close, curr + "(");
        }
        if (close < open) {
            helper(n, open, close + 1, curr + ")");
        }
    }
}