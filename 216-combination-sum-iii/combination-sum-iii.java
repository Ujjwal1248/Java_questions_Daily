class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> temp = new ArrayList<>();
        solve(k, n, 1, temp);
        return ans;
    }
    public void solve(int k, int target, int idx, List<Integer> temp){
        if(target == 0 && k== 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0 || k < 0 || idx > 9) return;
        temp.add(idx);
        solve(k-1, target - idx, idx+1, temp);
        temp.remove(temp.size() - 1);
        solve(k, target, idx+1, temp);
    }
}