class Solution {
    public List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        solve(candidates, target, 0, temp);
        return ans;
    }

    public void solve(int[] arr, int target, int idx, List<Integer> temp) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || idx >= arr.length)
            return;
        temp.add(arr[idx]);
        solve(arr, target - arr[idx], idx, temp);
        temp.remove(temp.size() - 1);
        solve(arr, target, idx + 1, temp);
    }
}