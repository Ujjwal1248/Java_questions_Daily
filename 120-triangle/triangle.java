class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] dp = new Integer[triangle.size()][triangle.size()];
        // for (int i = 0; i < triangle.size(); i++) {
        //     Arrays.fill(dp[i], -1);
        // }
        return helper(triangle, 0, 0, dp);
    }

    public int helper(List<List<Integer>> triangle, int i, int j, Integer[][] dp) {
        if (i == triangle.size() - 1)
            return triangle.get(i).get(j);
        if (dp[i][j] != null)
            return dp[i][j];
        int cr = triangle.get(i).get(j);
        int left = cr + helper(triangle, i + 1, j, dp);
        int right = cr + helper(triangle, i + 1, j + 1, dp);

        return dp[i][j] = Math.min(left, right);
    }
}