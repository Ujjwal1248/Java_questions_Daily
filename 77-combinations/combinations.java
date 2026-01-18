class Solution {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        solve(n, k, 1, temp);
        return ans;
    }
    public void solve(int n, int k, int start, List<Integer> temp){
        if(k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(start > n) return;
        temp.add(start);
        solve(n, k-1, start + 1, temp);
        temp.remove(temp.size() - 1);
        solve(n, k, start + 1, temp);
    }
}