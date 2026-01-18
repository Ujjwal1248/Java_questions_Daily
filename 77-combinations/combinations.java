class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        solve(n, k, 1, temp);
        return ans;
    }
    public void solve(int n, int k, int idx, List<Integer> temp){
        if(k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(idx > n) return;
        solve(n, k, idx + 1, temp);
        temp.add(idx);
        solve(n, k-1, idx + 1, temp);
        temp.remove(temp.size() - 1);
    }
}