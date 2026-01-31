class Solution {
    public int countGoodNumbers(long n) {
        long even = (n + 1)/2;
        long odd= n/2;
        long pow5 = pow(5,even);
        long pow4 = pow(4, odd);
        return (int) ((pow5 * pow4) % 1000000007);
    }
    public long pow(long x, long n) {
        if(n == 0) return 1;

        long half = pow(x, n/2);
        long res = (half * half) % 1000000007;
        if(n%2 == 1) res = (res * x) % 1000000007;
        return res;
    }
}