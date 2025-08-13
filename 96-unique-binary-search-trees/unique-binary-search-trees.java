class Solution {
    public int numTrees(int n) {
        if(n == 1) return 1;
        long res = 1;
        // Calculate binomial coefficient (2n choose n)
        for (int i = 0; i < n; i++) {
            res = res * (2L * n - i) / (i + 1);
        }
        // Divide by (n+1) to get Catalan number
        return (int)(res / (n + 1));
    }
}