class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k, n, 1, new ArrayList<>());
        return ans;
    }

    public void helper(int k, int n, int idx, ArrayList<Integer> curr) {
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (k < 0 || n < 0 || idx > 9)
            return;
        curr.add(idx);
        helper(k - 1, n - idx, idx + 1, curr);
        curr.removeLast();
        helper(k, n, idx + 1, curr);
    }
}