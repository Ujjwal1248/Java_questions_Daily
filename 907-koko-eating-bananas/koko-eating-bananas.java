class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for (int p : piles)
            high = Math.max(high, p);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long curr = helper(piles, mid);
            if (curr <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public long helper(int[] piles, int curr) {
        long total = 0;
        for (int p : piles) {
            total += (p + curr - 1) / curr;
        }
        return total;
    }
}