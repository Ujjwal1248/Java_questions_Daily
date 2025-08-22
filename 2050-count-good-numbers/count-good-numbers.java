class Solution {
    private static final long mod = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long pow5 = power(5, even);
        long pow4 = power(4, odd);
        return (int) ((pow5 * pow4) % mod);
    }

    public long power(long base, long exp) {
        if (exp == 0)
            return 1;
        long half = power(base, exp / 2);
        long result = (half * half) % mod;
        if (exp % 2 == 1)
            result = (result * base) % mod;
        return result;
    }
}