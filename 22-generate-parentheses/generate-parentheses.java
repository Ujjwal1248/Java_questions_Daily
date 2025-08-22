class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0)
            return ans;
        generate(n, n, "", ans);
        return ans;
    }

    public void generate(int open, int close, String current, List<String> ans) {
        if(open == 0 && close == 0){
            ans.add(current);
            return;
        }
        if(open > 0){
            generate(open -1, close, current + "(", ans);
        }
        if(close > open){
            generate(open, close-1, current + ")", ans);
        }
    }
}