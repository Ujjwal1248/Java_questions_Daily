class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a,b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(ans.isEmpty() || ans.get(ans.size() - 1).get(1) < nums[i][0]){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i][0]);
                temp.add(nums[i][1]);
                ans.add(temp);
            }
            else{
                List<Integer> last = ans.get(ans.size() - 1);
                last.set(1, Math.max(last.get(1), nums[i][1]));
            }
        }
        int[][] res = new int[ans.size()][2];
        for(int i = 0; i < ans.size(); i++){
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }
        return res;
    }
}