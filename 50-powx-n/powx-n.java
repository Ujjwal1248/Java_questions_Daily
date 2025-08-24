class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long N = n;
        if (n < 0) {
            x = 1 / x;
            N = -N;
        }
        while (N > 0) {
            if (N % 2 != 0) {
                ans *= x;
                N--;
            } else {
                N /= 2;
                x *= x;
            }
        }
        return ans;
    }
}