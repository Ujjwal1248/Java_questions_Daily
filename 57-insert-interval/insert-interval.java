class Solution {
    public int[][] insert(int[][] nums, int[] newInterval) {
        int n = nums.length;
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < n && nums[i][1] < newInterval[0]) {
            result.add(nums[i]);
            i++;
        }
        while (i < n && nums[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], nums[i][0]);
            newInterval[1] = Math.max(newInterval[1], nums[i][1]);
            i++;
        }
        result.add(newInterval);
        while (i < n) {
            result.add(nums[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}