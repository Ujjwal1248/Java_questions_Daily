class Solution {
    public int maxFrequency(int[] A, int k) {
        int[] count = new int[51];
        int res = 0;
        for (int a : A) {
            count[a] = Math.max(count[a], count[k]) + 1;
            res = Math.max(res, count[a] - count[k]);
        }
        return count[k] + res;
    }
}