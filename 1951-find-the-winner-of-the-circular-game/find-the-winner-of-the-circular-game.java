class Solution {
    public int findTheWinner(int n, int k) {
        int count = helper(n, k);
        return count + 1;
    }

    public int helper(int n, int k) {
        if (n == 1)
            return 0;
        int x = helper(n - 1, k);
        int y = (x + k) % n;
        return y;
    }

}